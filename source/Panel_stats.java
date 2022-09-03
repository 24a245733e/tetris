package com.tetris;

import java.awt.Color;
import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel_stats extends JPanel implements Observer{

    KeyListenerExample kla;
    
    public Panel_stats(){
        super();
        this.setBounds(160, 0, 320, 480);
        this.setBackground(Color.decode("#2255BB"));
    }
    // Observer observer;
    public void update(KeyEvent keyEvent)
    {
        System.out.println(String.format("SS: %d", keyEvent.getKeyCode()));
       //do whatever here when key event occurs
    }
    public void addkle(KeyListenerExample kl) {
        kla = kl;
    }


}
