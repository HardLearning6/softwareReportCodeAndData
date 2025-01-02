import os
import traceback
from bs4 import BeautifulSoup as bs
from datetime import datetime

error = open('log-error.txt', 'a+')
outputAll = open('./reports/all.csv', 'w')
outputAll.write("PRJ;FolderName;Cobertos;Gerados;Cobertura;Mortos;Total;Escore\n")

dados = open('files.txt', 'r')
for x in dados:
    x = x.strip()
    info = x.split(':')
    prj = info[0]

    output = open('./reports/' + prj + '.csv', 'w')
    output.write("PRJ;FolderName;Cobertos;Gerados;Cobertura;Mortos;Total;Escore\n")

    # 遍历 ../projetos/{prj}/reports/ 目录下所有以 ds 开头的文件夹
    reports_dir = f"../projetos/{prj}/reports/"
    for foldername in os.listdir(reports_dir):
        if foldername.startswith('ds'):
            try:
                # 构建index.html的路径
                html_path = os.path.join(reports_dir, foldername, 'index.html')

                with open(html_path, 'r') as html:
                    soup = bs(html, 'html.parser')
                    divs = soup.findAll(attrs={'class': 'coverage_percentage'})
                    covs = soup.findAll(attrs={'class': 'coverage_legend'})

                    # 使用文件夹名作为“温度”字段
                    output.write(prj + ";")
                    output.write(foldername + ";")  # 文件夹名作为Temperature
                    output.write(covs[2].text.split("/")[0].strip() + ";")
                    output.write(covs[2].text.split("/")[1].strip() + ";")
                    output.write(divs[0].text.strip() + ";")
                    output.write(covs[3].text.split("/")[0].strip() + ";")
                    output.write(covs[3].text.split("/")[1].strip() + ";")
                    output.write(divs[1].text.strip())
                    output.write("\n")
                    output.flush()

                    # 写入总报告
                    outputAll.write(prj + ";")
                    outputAll.write(foldername + ";")  # 文件夹名作为Temperature
                    outputAll.write(covs[2].text.split("/")[0].strip() + ";")
                    outputAll.write(covs[2].text.split("/")[1].strip() + ";")
                    outputAll.write(divs[0].text.strip() + ";")
                    outputAll.write(covs[3].text.split("/")[0].strip() + ";")
                    outputAll.write(covs[3].text.split("/")[1].strip() + ";")
                    outputAll.write(divs[1].text.strip())
                    outputAll.write("\n")
                    outputAll.flush()

            except Exception as e:
                var = traceback.format_exc()
                now = datetime.now()
                current_time = now.strftime("%H:%M:%S")
                error.write(current_time)
                error.write(f" - {prj} - ERROR: /reports/{foldername}/index.html\n")
                error.write(var)
                error.write("\n")

    output.close()

dados.close()
output.close()
outputAll.close()
error.close()
