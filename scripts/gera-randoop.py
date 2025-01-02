import sys
import os
import shutil

if len(sys.argv) < 1:
    print("error: gera-evo.py")
    print("Example: gera-evo.py")
    sys.exit(1)

# 读取 files.txt 文件
dados = open('files.txt', 'r')

for x in dados:
    x = x.strip()
    info = x.split(':')
    prj = info[0]
    clazz = info[1]

    print(f"[INFO] 正在处理项目: {prj}, 类: {clazz}")

    # 读取 seeds.txt 文件
    seeds = open('seeds.txt', 'r')

    for seed in seeds:
        seed = seed.strip()

        print(f"[INFO] 使用随机种子: {seed}")

        className = clazz.split('.')

        # 构建 Randoop 命令
        cmd = (
            f"cd ../projetos/{prj}; mvn compile; java -classpath target/classes:/home/chenyuwen/randoop-4.2.4/randoop-all-4.2.4.jar "
            f"randoop.main.Main gentests --regression-test-basename=Randoop --usethreads "
            f"--testclass={clazz} --time-limit=30 --randomseed={seed} "
            f"--junit-output-dir=src/test/java/ --junit-package-name=ds.RandoopTest --log=FINE"
            f"--no-error-revealing-tests"
        )

        print(f"[DEBUG] 执行命令: {cmd}")

        # 执行 Randoop 命令
        result = os.system(cmd)
        if result != 0:
            print(f"[ERROR] Randoop 命令执行失败，退出代码: {result}")
            continue

        # 进入生成的测试文件目录并执行重命名与包名修改操作
        test_dir = f"../projetos/{prj}/src/test/java/ds"
        randoop_dir = os.path.join(test_dir, "RandoopTest")

        print(f"[DEBUG] 检查测试文件目录: {test_dir}")

        # 确保 RandoopTest 文件夹存在（如果没有的话）
        os.makedirs(randoop_dir, exist_ok=True)
        print(f"[INFO] 确保测试文件夹存在: {randoop_dir}")

        # 假设文件名为 RandoopTest.java
        randoop_file = os.path.join(test_dir, "Randoop.java")

        if os.path.exists(randoop_file):
            print(f"[INFO] 找到测试文件: {randoop_file}")

            # 直接移动并重命名文件到 RandoopTest 文件夹
            new_randoop_file = os.path.join(randoop_dir, "Randoop.java")
            os.rename(randoop_file, new_randoop_file)
            print(f"[INFO] 测试文件已重命名并移动到: {new_randoop_file}")

            # 修改文件中的类名和包名
            with open(new_randoop_file, 'r') as file:
                content = file.read()

            content = content.replace("class Randoop", "class RandoopTest")
            content = content.replace("ds;", "ds.RandoopTest;")

            # 写回修改后的内容
            with open(new_randoop_file, 'w') as file:
                file.write(content)
            print(f"[INFO] 已更新类名和包名: {new_randoop_file}")
        else:
            print(f"[WARNING] 未找到测试文件: {randoop_file}")

    seeds.close()

# 删除生成的临时 RandoopTest 目录
randoop_test_dir = f"../projetos/{prj}/ds"
if os.path.exists(randoop_test_dir):
    shutil.rmtree(randoop_test_dir)
    print(f"[INFO] 已删除临时文件夹: {randoop_test_dir}")
else:
    print(f"[WARNING] 临时文件夹不存在: {randoop_test_dir}")

dados.close()
print("[INFO] 所有操作完成！")
