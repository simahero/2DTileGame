package com.simahero.game.states;

import com.simahero.game.util.KeyHandler;
import com.simahero.game.util.MouseHandler;

import java.awt.Graphics2D;

public abstract class GameStates {

    private GameStateManager gsm;

    public GameStates(GameStateManager gsm){
        this.gsm = gsm;

    }

    public abstract void update();
    public abstract void input(MouseHandler mouse, KeyHandler key);
    public abstract void render(Graphics2D g);
}
