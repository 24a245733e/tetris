package com.tetris;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import com.tetris.gui.*;

// import java.awt.event.*;
import javax.swing.KeyStroke;
// import javax.swing.*;
// import java.awt.Container;
import javax.swing.InputMap;
import javax.swing.AbstractAction;

import java.awt.event.ActionEvent;

public class GameFrame extends JFrame{
    Panel_game panel_game;
    Panel_stats panel_stats;
    // KeyListenerExample kl;

    public Panel_game get_panel_game(){
        return panel_game;
    }

    public GameFrame(){
        super();
        this.setSize(640, 480);
        panel_game = new Panel_game();

        panel_stats = new Panel_stats();
        
        panel_game.getActionMap().put("foo", new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("hello, world");
                }
            });
        InputMap inputMap = panel_game.getInputMap();
        inputMap.put(KeyStroke.getKeyStroke(Character.valueOf('a'), 0), "foo");

        this.getContentPane().add(panel_game);
        this.getContentPane().add(panel_stats);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
