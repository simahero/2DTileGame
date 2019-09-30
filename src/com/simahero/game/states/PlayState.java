package com.simahero.game.states;

import com.simahero.game.util.KeyHandler;
import com.simahero.game.util.MouseHandler;

import java.awt.*;

public class PlayState extends GameStates {

    public PlayState(GameStateManager gsm){
        super(gsm);

    }

    @Override
    public void update() {

    }

    @Override
    public void input(MouseHandler mouse, KeyHandler key) {

    }

    @Override
    public void render(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillRect(100, 100, 200, 200);

    }
}
