package com.william.task1.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.william.task1.sprites.Heli;
import com.william.task1.task1;

public class PlayState extends State {


    private Heli heli;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        heli = new Heli(250,250);
        cam.setToOrtho(false, task1.WIDTH/2, task1.HEIGHT/2);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        handleInput();
        heli.update(dt);
    }

    @Override
    public void render(SpriteBatch sb) {

    }

    @Override
    public void dispose() {

    }
}
