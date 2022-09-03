package com.tetris.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList; // import the ArrayList class
import java.util.Random;
import java.awt.event.KeyEvent;
// import java.awt.event.KeyListener;
import com.tetris.ui.*;

public class Panel_grand extends JPanel{

    public KeyListenerExample kla;
    public int coord_x_0 = 0;
    public int coord_y_0 = 0;
    public int width = 320;
    public int height = 480;
    public Color color = Color.decode("#AA9999");
    public Panel_grand(){
        super();
        this.setBounds(coord_x_0, coord_y_0, width, height);
        this.setBackground(color);
    }
    // public void update(KeyEvent keyEvent)
    // {
    // }
    // public void addkle(KeyListenerExample kl) {
    //     kla = kl;
    // }


}
