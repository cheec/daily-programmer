@ECHO OFF

REM compile the code into the bin folder
javac -cp src -d bin src/main/Challenge245.java

java -classpath bin main.Challenge245

PAUSE
