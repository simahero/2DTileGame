package com.simahero.game.util;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class KeyHandler implements KeyListener {

    public static ArrayList<Key> keys = new ArrayList<>();

    public class Key {

        public int presses, absorbs;
        public boolean down, clicked;


        public Key(){
            keys.add(this);
        }

        public void toggle(boolean pressed) {
            if (pressed != down) {
                down = pressed;
            }
            if (pressed){
                presses++;
            }
        }

        public void tick(){
            if (absorbs < presses){
                clicked = true;
            } else {
                clicked = false;
            }
        }
    }

    public KeyHandler(GamePanel game){
        game.addKeyListener(this);
    }

    public Key up = new Key();
    public Key down = new Key();
    public Key left = new Key();
    public Key right = new Key();
    public Key attack = new Key();
    public Key menu = new Key();
    public Key enter = new Key();
    public Key escape = new Key();

    public void releaseAll(){
        for (int i = 0; i < keys.size(); i++){
            keys.get(i).down = false;
        }
    }

    public void tick(){
        for (int i = 0; i < keys.size(); i++){
            keys.get(i).tick();
        }
    }

    public void toggle(KeyEvent e, boolean pressed){
        if (e.getKeyCode() == KeyEvent.VK_W) up.toggle(pressed);
        if (e.getKeyCode() == KeyEvent.VK_S) down.toggle(pressed);
        if (e.getKeyCode() == KeyEvent.VK_A) left.toggle(pressed);
        if (e.getKeyCode() == KeyEvent.VK_D) right.toggle(pressed);
        if (e.getKeyCode() == KeyEvent.VK_SPACE) attack.toggle(pressed);
        if (e.getKeyCode() == KeyEvent.VK_E) menu.toggle(pressed);
        if (e.getKeyCode() == KeyEvent.VK_ENTER) enter.toggle(pressed);
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) escape.toggle(pressed);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        //do nothing
    }

    @Override
    public void keyPressed(KeyEvent e) {
        toggle(e, true);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        toggle(e, false);

    }
}
