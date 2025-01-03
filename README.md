# 软件测试期末报告实验代码和数据

编号前33的实验项目来自paper "An initial investigation of ChatGPT unit test generation
capability", accepted for publication at SAST'2023
源仓库的地址为https://github.com/aurimrv/initial-investigation-chatgpt-unit-tests

作者的实验环境是Ubuntu 20.04

项目结构:  
projetos:存放实验Java项目。  
每个项目的reports文件夹存放PIT为每一个测试类生成的报告，src\main\java\ds中是项目的源码，包括待测试类。  
src\test\java\ds\EvoSuiteTest，src\test\java\ds\gptTest和src\test\java\ds\RandoopTest中分别存着由EvoSuite,GPT-4o-min,Randoop生成的测试套件代码。
项目都是使用IDEA打开，使用Maven作为包管理器，classpath.xml为原作者配置，项目34Weekday中如果使用eclipse打开需要配置classpath.xml文件。

scripts:存放实验的自动化的python程序  
scripts\reports:存放程序reports.py执行的结果，提取PIT生成的报告中的信息并汇总到all.cvs文件中。 
files.txt/file.txt:写入项目名称和目标待测试类
gera-chatgpt.py:根据files.txt中的项目自动与GPT-4o-min进行交互得到测试类并存入项目的src\test\java\ds\gptTest中，其中apikey使用的是国内的中转网站，详见https://agicto.com/
testconnect.py:根据https://agicto.com/提供的交互方式，测试apikey和模型的连接是否成功。
gera-evo.py:根据files.txt中的项目使用EvoSuite生成测试文件并存入项目的src\test\java\ds\EvoSuiteTest中
gera-randoop.py:根据files.txt中的项目使用Randoop生成测试文件并存入项目的src\test\java\ds\RandoopTest中
reports.py:提取PIT的报告并汇总


