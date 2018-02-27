@ECHO	OFF
REM	---------------------------------------------------------------------
REM	the	directory	path	to	java.exe	on	your	machine	may	be	different
REM	from	the	path	I	have	between	the	double	quotes	below	to	this	may
REM	need	to	be	changed	in	order	for	compile	to	work	on	your	machine
REM	IF	JAVA_HOME	is	set	you	do	not	need	to	specify	the	path	just	java
REM	---------------------------------------------------------------------
"C:\Program Files\Java\jdk1.8.0_162\bin\java.exe" 

Java -cp target\MusicProject-v1.jar FoleyDes.MusicProject.App

Java -cp target\MusicProject-v1.jar FoleyDes.MusicProject.App -v

Java -cp target\MusicProject-v1.jar FoleyDes.MusicProject.App -help

Java -cp target\MusicProject-v1.jar FoleyDes.MusicProject.App -version

PAUSE