package com.tetris;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList; // import the ArrayList class
import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.tetris.gui.*;

public class Panel_game extends Panel_grand{

    public int iterator;
    public String message;
    private Gamefield gf;
    private int block_size = 33;
    public Color color = Color.decode("#beede9"); //cyan
    ArrayList<Tetromino> tetrominoes = new ArrayList<Tetromino>();
    public Panel_game(){
        super();
        this.setBounds(coord_x_0, coord_y_0, width, height);
        this.setBackground(color);
    }

    public void add_gf(Gamefield gf1) {
        gf = gf1;
        // doDrawing();
    }
    // public void main(){
    //
    //
    //     gf = new Gamefield();
    //     kla.AddObserver(gf);
    //     gf.init_rows();
    //
    //     gf.add_test_tetromino();
    //     while (gf.GAME_RUNNING) {
    //         if (gf.if_fix_tetno()){
    //             gf.add_test_tetromino();
    //         }
    //
    //         for (int i = 0; i < PERIOD_GAME; i++){
    //             gf.choose_action();
    //             delay(PERIOD_PLAYER);
    //             repaint();
    //         }
    //         gf.move_down();
    //         repaint();
    //         System.out.println(String.format("game running"));
    //     }
    //
    // }




    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }


    public void paint_empty(Graphics g, int x, int y) {
        g.setColor(Color.decode("#888888"));
        g.fillRect(x, y, 33, 33);
    }
    public void paint_full(Graphics g, int x, int y) {
        g.setColor(Color.decode("#881111"));
        g.fillRect(x, y, 33, 33);
    }

    public void doDrawing(Graphics g) {
        g.setColor(Color.decode("#FFFFFF"));
        g.fillRect(0, 0, 10000, 10000);
        // System.out.println(String.format("object %s", gf.field));
        int y = 0;
        for (Gamefield_row gf_r : gf.field) {
            // System.out.println(String.format("object %s", gf_r.cells));
            int x = 0;
            for (Gamefield_cell gf_c : gf_r.cells) {
                // System.out.println(String.format("gf_c.check(): %b", gf_c.if_vacant()));
                if (gf_c.if_vacant()) {
                    paint_full(g, x, y);
                } else {
                    paint_empty(g, x, y);
                }
                x += 40;
            }
            y += 40;
        }


    }

}
