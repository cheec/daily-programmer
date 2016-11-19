@ECHO OFF

REM compile the code into the bin folder
javac -cp src -d bin src/main/Challenge235.java

REM run the program, feed commands from input.txt file and redirect the output to the actual.txt
java -classpath bin main.Challenge235

PAUSE
