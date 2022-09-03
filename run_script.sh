#!/bin/sh
clear
rm bin/com/tetris/*.class
rm bin/com/tetris/gui/*.class
javac source/gui/*.java -d bin
javac source/*.java -d bin -cp bin

java -cp bin com.tetris.Main
