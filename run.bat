@ECHO off

"C:\Program Files (x86)\Java\jdk1.8.0_162\bin\java.exe" 

java -cp target\MusicProject-V1.jar FoleyDes.MusicProject.App -d jdbc:sqlite:database/NewFoleyDes.db

java -cp  target\MusicProject-V1.jar FoleyDes.MusicProject.App -v

java -cp  target\MusicProject-V1.jar FoleyDes.MusicProject.App -version

java -cp  target\MusicProject-V1.jar FoleyDes.MusicProject.App -h

java -cp  target\MusicProject-V1.jar FoleyDes.MusicProject.App 

PAUSE