@echo off
cd /d %~dp0
echo Инициализация git...
git init
git remote add origin https://github.com/zsxzsx7373/boosterfa7-signed.git
git add .
git commit -m "🚀 First upload of BoosterFA7 Gradle project"
git push -f origin master
pause