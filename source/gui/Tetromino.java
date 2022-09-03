package com.tetris.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList; // import the ArrayList class

public class Tetromino extends Drawable_square{
    static final int POS_X = 0;
    static final int POS_Y = 0;
    static final int width = 20;
    static final int height = 20;

    ArrayList<Drawable_square> type_a = new ArrayList<Drawable_square>();

    public Tetromino(Color color) {
        // Color color = Color.decode(String.format("#22%s222", Integer.toHexString(3)));

        Drawable_square square = new Drawable_square();
        square.set_all(POS_X, POS_Y, width, height, color);
        type_a.add(square);

        square = new Drawable_square();
        square.set_all(POS_X + width, POS_Y, width, height, color);
        type_a.add(square);

        square = new Drawable_square();
        square.set_all(POS_X + width, POS_Y + height, width, height, color);
        type_a.add(square);

        square = new Drawable_square();
        square.set_all(POS_X + 2*width, POS_Y + height, width, height, color);
        type_a.add(square);
    }

    public void draw(Graphics g) {
        System.out.println("draw type_a");
        for (Drawable_square square : type_a) {
            // square.moveto(pos_x, pos_y);
            g.setColor(square.color);
            System.out.println(String.format("color_xx: %s", square.color));
            g.fillRect(square.pos_x, square.pos_y, square.width, square.height);
            // break;
            System.out.println(String.format("\t%s", square));
            System.out.println(String.format("square.pos_x: %s, square.pos_y: %s, square.width: %s, square.height: %s", square.pos_x, square.pos_y, square.width, square.height));
        }
    }

    public void moveto(int a_pos_x, int a_pos_y) {
        pos_x = a_pos_x;
        pos_y = a_pos_y;
        type_a.get(0).moveto(a_pos_x, a_pos_y);
        type_a.get(1).moveto(a_pos_x + width, a_pos_y);
        type_a.get(2).moveto(a_pos_x + width, a_pos_y + height);
        type_a.get(3).moveto(a_pos_x + 2*width, a_pos_y + height);
    }

}
