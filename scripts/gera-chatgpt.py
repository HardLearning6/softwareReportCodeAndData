import sys
import os
from openai import OpenAI

def read_java_files(folder_path):
    print(f"Lendo códigos fonte no diretório {folder_path} \n")
    java_files = []
    for file_name in os.listdir(folder_path):
        if file_name.endswith(".java"):
            file_path = os.path.join(folder_path, file_name)
            with open(file_path, "r") as file:
                text = file.read()
                java_files.append(f"```{text}```")
    return java_files


def request_test_generation(code, clazz, temperature):
    try:
        client = OpenAI(
            api_key="sk-VhL8VSCKg6AKafd7iiKVqLZzgYxhxapBXli5uYbPUFc6uli2",
            base_url="https://api.agicto.cn/v1"  # 使用指定的API URL
        )

        # 通过OpenAI API生成测试用例
        chat_completion = client.chat.completions.create(
            messages=[
                {
                    "role": "user",
                    "content": f"""
Generate functional test cases to cover all decisions in the methods of the class under testing.
All conditional expressions must assume true and false values.
Tests with Boundary Values are also mandatory. For numeric data, always use positive and negative values.
All tests must be in one Java class file.
Include all necessary imports.
It is mandatory to throws Exception in all test method declarations.
It is mandatory to include timeout=1000 in all @Test annotations.
It is mandatory to test for the default constructor.
Each method in the class under test must have at least one test case.
Even simple or void methods must have a test calling it with valid inputs.
@Test(expected= must be used only if the method under testing explicitly throws an exception.
Test must be in JUnit 4 framework format.
Test set header package and import dependencies:
package ds;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import ds.*;
The class under testing is {clazz}.
The test class must be {clazz}Test; Class under testing

{code}

Please include the start and end markers in the code as follows:
<!-- start-java-code -->
<Generated Java test code here>
<!-- end-java-code -->
                    """
                }
            ],
            model="gpt-4o-mini",  # 你可以更换其他的模型，参照您的模型列表
            temperature=temperature,
        )
        # 打印原始返回内容
        print("Original model response:")
        print(chat_completion)  # 打印原始响应对象
        content = chat_completion.choices[0].message.content
        print(f"Request enviada com sucesso para o projeto: {clazz} \n")
        return content
    except Exception as e:
        print(f"FAILED TO REQUEST CHATGPT, RETRYING... Error: {e}")
        return request_test_generation(code, clazz, temperature)


def extract_code(code, clazz, only_code):
    """
    从生成的回复中提取出Java代码（包括起始和结束标识符），并去除Markdown标记。
    """
    start_marker = "<!-- start-java-code -->"
    end_marker = "<!-- end-java-code -->"

    # 查找开始和结束标识符之间的代码
    start_index = code.find(start_marker)
    end_index = code.find(end_marker)

    if start_index != -1 and end_index != -1:
        # 截取标识符之间的代码
        extracted_code = code[start_index + len(start_marker):end_index].strip()

        # 去除多余的 Markdown 代码块标记
        if extracted_code.startswith("```java"):
            extracted_code = extracted_code[len("```java"):].strip()

        if extracted_code.endswith("```"):
            extracted_code = extracted_code[:-3].strip()

    else:
        extracted_code = ""  # 如果找不到标识符之间的代码，返回空字符串

    return extracted_code


def generate_tests(code, clazz, temperature):
    generated_tests = request_test_generation(code, clazz, temperature)
    generated_tests = extract_code(generated_tests, clazz, True)  # Only keep the first generated test class
    generated_tests = generated_tests.replace("package ds;", "package ds.gptTest;")
    return generated_tests

def get_test_path(prj, clazz):
    return os.path.join("..", "projetos", prj, "src", "test", "java", "ds", "gptTest", f"{clazz}Test.java")

if len(sys.argv) < 1:
    print("error: gera-chatgpt.py")
    print("Example: gera-chatgpt.py")
    sys.exit(1)

# Reading the projects from 'files.txt'
with open('files.txt', 'r') as dados:
    for x in dados:
        x = x.strip()
        info = x.split(':')
        prj = info[0]
        clazz = info[1].replace("ds.", "")

        # Reading the source code from Java files in the project
        source_path = os.path.join("..", "projetos", prj, "src", "main", "java", "ds")
        os.makedirs(os.path.dirname(get_test_path(prj, clazz)), exist_ok=True)

        # Read Java source code files
        code = read_java_files(source_path)

        # Generate only one test class for each Java class
        temperature = 0.6
        generated_tests = generate_tests(code, clazz, temperature)

        # Write the generated test code to the file
        with open(get_test_path(prj, clazz), "w") as file:
            file.write(generated_tests)

        print(f"Arquivo de testes gerado para a classe {clazz} no projeto: {prj} \n")
