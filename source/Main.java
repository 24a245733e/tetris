package com.tetris;

public class Main{
    public static void main(String[] args) {
        GameFrame frame = new GameFrame();
        Game game = new Game(frame);
        game.new_game();

    }
}
