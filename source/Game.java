package com.tetris;

import com.tetris.ui.*;
import com.tetris.gui.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.AbstractAction;
import javax.swing.Action;

import javax.swing.JComponent;
import javax.swing.KeyStroke;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
// public class Game extends JComponent implements Observer{
public class Game extends JComponent{
    public GameFrame frame;
    public Panel_game panel_game;
    static final int PERIOD_PLAYER = 100;
    public int Difficulty = 1;
    public int PERIOD_GAME = 10/Difficulty;
    // public KeyListenerExample kla;
    public KeyListenerExample kl;
    public int keyCode;

    public Game (GameFrame frame) {
        frame = frame;
        panel_game = frame.get_panel_game();
    }

    public static void delay(int time) {
        long endTime = System.currentTimeMillis() + time;
        while (System.currentTimeMillis() < endTime)
        {
            // do nothing
        }
    }

    // public void addkle(KeyListenerExample kl) {
    //     kla = kl;
    // }
    public void update(KeyEvent keyEvent)
    {
        keyCode = keyEvent.getKeyCode();
        System.out.println(String.format("keyCode: %d", keyCode));
       //do whatever here when key event occurs
    }



    public void new_game(){
        // Action anAction = new AbstractAction() {
        //     public void actionPerformed(ActionEvent e) {
        //         System.out.println(String.format("f2"));
        //     }
        // };
        Gamefield gf = new Gamefield();
        // kl = new KeyListenerExample();
        // kl.AddObserver(this);

        //
        // this.getActionMap().put("doSomething",
        //                      anAction);
        // add(this);
        // while (true) {
        //     delay(500);
        //     // System.out.println("running...");
        // }
        // this.addKeyListener(kl);
        // this.AddObserver(gf);
        // gf.init_rows();
        //
        // gf.add_test_tetromino();
        // while (gf.GAME_RUNNING) {
        //     if (gf.if_fix_tetno()){
        //         gf.add_test_tetromino();
        //     }
        //
        //     for (int i = 0; i < PERIOD_GAME; i++){
        //         gf.choose_action();
        //         delay(PERIOD_PLAYER);
        //         panel_game.repaint();
        //     }
        //     gf.move_down();
        //     panel_game.repaint();
        //     System.out.println(String.format("game running"));
        // }
    }
}
