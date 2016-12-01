@ECHO OFF

REM compile the code into the bin folder
javac -cp src -d bin src/main/Challenge293.java

java -classpath bin main.Challenge293

PAUSE
