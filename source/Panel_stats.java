package com.tetris;

import java.awt.Color;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.tetris.gui.*;

public class Panel_stats extends Panel_grand{

    public int coord_x_0 = 160;
    public Color color = Color.decode("#AA99FF"); //purple
    public Panel_stats(){
        super();
        this.setBounds(coord_x_0, coord_y_0, width, height);
        this.setBackground(color);
    }

}
