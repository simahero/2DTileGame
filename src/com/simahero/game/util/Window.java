package com.simahero.game.util;

import javax.swing.*;

public class Window extends JFrame {

    public Window(){
        setTitle("2D Tile Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new GamePanel(1280, 720));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
