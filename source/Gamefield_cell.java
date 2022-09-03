package com.tetris;

public class Gamefield_cell {
    private boolean vacant = false;
    public void on (){
        vacant = true;
    }
    public void off (){
        vacant = false;
    }
    public boolean if_vacant (){
        return vacant;
    }

}
