#!/bin/sh
clear
rm doc_generator/bin/*.class
echo 1
javac doc_generator/DumpMethods.java -d doc_generator/bin
echo 2
java -cp doc_generator/bin DumpMethods
echo 3
