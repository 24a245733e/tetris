#!/bin/sh
clear
rm bin/com/tetris/*.class
javac source/* -d bin

java -cp bin com.tetris.Main
