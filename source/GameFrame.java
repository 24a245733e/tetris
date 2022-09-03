package com.tetris;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

import com.tetris.gui.*;
public class GameFrame extends JFrame{
    public GameFrame(){
        super();
        this.setSize(640, 480);
        Panel_game panel_game = new Panel_game();

        Panel_stats panel_stats = new Panel_stats();



        KeyListenerExample kl = new KeyListenerExample();
        this.addKeyListener(kl);
        panel_game.addkle(kl);
        panel_stats.addkle(kl);
        this.add(panel_game);
        this.add(panel_stats);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel_game.main();
    }
}
