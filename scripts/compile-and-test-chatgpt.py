import sys
import os
import shutil

if len(sys.argv) < 1:
    print("error: gera-chatgpt.py")
    print("Example: gera-chatgpt.py")
    sys.exit(1)


# 定义一个函数，执行 PIT 分析
def run_pit_analysis(prj, clazz, test_folder):
    # 源测试文件夹
    source_dir = f"../projetos/{prj}/src/test/java/ds/{test_folder}"

    # 检查源目录是否有测试文件
    if not os.path.exists(source_dir):
        print(f"警告: 源目录 {source_dir} 不存在！")
        return

    # 获取源目录下所有 .java 文件作为类名
    test_files = [f for f in os.listdir(source_dir) if f.endswith(".java")]
    if not test_files:
        print(f"警告: 在 {source_dir} 中没有找到测试文件！")
        return

    # 处理每个测试文件
    for test_file in test_files:
        test_class_name = os.path.splitext(test_file)[0]  # 取文件名作为类名
        print(f"正在处理测试类: {test_class_name}")

        # 执行 PIT 分析
        print(f"Executando teste do projeto {prj}. Teste: {test_class_name}")

        # 执行 PIT 测试并生成报告
        cmd = f"cd ../projetos/{prj}; mvn -DclassName=\"ds.{clazz}\" -DtestName=\"ds.{test_folder}.{test_class_name}\" clean install org.pitest:pitest-maven:mutationCoverage"
        print(f"执行命令: {cmd}")
        os.system(cmd)


# 打开文件并读取内容
dados = open('files.txt', 'r')
for x in dados:
    print(x)
    x = x.strip()
    info = x.split(':')
    prj = info[0]  # 项目名称
    clazz = info[1].replace("ds.", "")  # 类名去除"ds."前缀

    # 对每个文件夹进行处理
    for test_folder in ["EvoSuiteTest", "gptTest", "RandoopTest"]:
        run_pit_analysis(prj, clazz, test_folder)

# 关闭文件
dados.close()
