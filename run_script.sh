#!/bin/sh
clear

rm bin/com/tetris/*.class > out.log 2> /dev/null
rm bin/com/tetris/ui/*.class > out.log 2> /dev/null
rm bin/com/tetris/gui/*.class > out.log 2> /dev/null
rm bin/com/tetris/tetrominoes/*.class > out.log 2> /dev/null

if javac source/ui/*.java -d bin ; then
    echo "ui compiled"
else
    echo "ui failed"
    exit
fi
if javac source/gui/*.java -d bin -cp bin; then
    echo "gui compiled"
else
    echo "gui failed"
    exit
fi
if javac source/tetrominoes/*.java -d bin -cp bin; then
    echo "tetrominoes compiled"
else
    echo "tetrominoes failed"
    exit
fi
if javac source/*.java -d bin -cp bin; then
    echo "source compiled"
else
    echo "source failed"
    exit
fi


java -cp bin com.tetris.Main
