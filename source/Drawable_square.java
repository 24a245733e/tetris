package com.tetris;

import javax.swing.*;
import java.awt.*;

public class Drawable_square{
    public int pos_x;
    public int pos_y;
    public int width;
    public int height;
    public Color color;

    public void set_all(int a_pos_x, int a_pos_y, int a_width, int a_height, Color a_color) {
        pos_x = a_pos_x;
        pos_y = a_pos_y;
        width = a_width;
        height = a_height;
        color = a_color;
    }
    public void moveto(int a_pos_x, int a_pos_y) {
        pos_x = a_pos_x;
        pos_y = a_pos_y;
    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(pos_x, pos_y, width, height);
    }

}
