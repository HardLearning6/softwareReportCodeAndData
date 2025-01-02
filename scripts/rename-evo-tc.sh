#!/bin/bash
CLAZZ=$1
SEED=$2

TCNAME=$(echo $CLAZZ\_ESTest)
SCAFFOLDING=$(echo $CLAZZ\_ESTest\_scaffolding)
EVONAME=$(echo Evo)

PRJ=$PWD

echo $TCNAME

echo $EVONAME

echo $PWD

# 修改文件夹名为 EvoSuiteTest
mkdir -p src/test/java/ds/EvoSuiteTest

# 复制生成的测试文件
cp evosuite-tests/ds/*.java src/test/java/ds/EvoSuiteTest

cd src/test/java/ds/EvoSuiteTest

# 重命名文件
echo mv $TCNAME.java $EVONAME.java
mv $TCNAME.java $EVONAME.java

# 修改文件中的类名和包名
sed -i "s/$TCNAME/$EVONAME/" "$EVONAME.java"
sed -i "s/ds\;/ds\.EvoSuiteTest\;/" "$EVONAME.java"
sed -i "s/ds\;/ds\.EvoSuiteTest\;/" "$SCAFFOLDING.java"

cd $PRJ

# 删除临时生成的文件夹
rm -rf evosuite-tests evosuite-report
