package com.tetris.tetrominoes;

public class Tet_no{
    public int x1, y1, x2, y2, x3, y3, x4, y4;
    // public int[] bottom_x;
    // public int[] bottom_y;
    public int[] bottom_cells = {2, 3, 4};
    private void config () {
        x2 = x1 + 0;
        y2 = y1 + 1;
        x3 = x1 + 1;
        y3 = y1 + 0;
        x4 = x1 + 2;
        y4 = y1 + 0;
    }
    public Tet_no(int x1, int y1) {
        x1 = x1;
        y1 = y1;
        config();
    }
    public Tet_no() {
        x1 = 1;
        y1 = 1;
        config();
    }
    public void move_down() {
        y1 += 1;
        config();
    }
    public void move_up() {
        y1 -= 1;
        config();
    }
    public void move_left() {
        x1 -= 1;
        config();
    }
    public void move_right() {
        x1 += 1;
        config();
    }

}
