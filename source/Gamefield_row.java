package com.tetris;

import java.util.ArrayList;

public class Gamefield_row {
    public final int ROW_LENGTH = 7;
    public boolean set = false;

    public ArrayList<Gamefield_cell> cells = new ArrayList<Gamefield_cell>();
    public Gamefield_row() {
        for (int i = 0; i <= ROW_LENGTH; i++) {
            cells.add(new Gamefield_cell());
        }
    }
    public boolean check(){
        // boolean row_set = false;
        for (Gamefield_cell cell : cells){
            if (cell.if_vacant() == true) {
                set = false;
            } else {
                set = true;
            }
        }
        return set;
    }
}
