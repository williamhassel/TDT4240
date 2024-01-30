package com.william.task1.states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.william.task1.sprites.Heli;
import com.william.task1.task1;

public class PlayState extends State {


    private Heli heli;
    private Sprite chopper;
    private Texture bg;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        heli = new Heli(200,250);
        bg = new Texture("bg.png");
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
        sb.begin();
        sb.draw(bg, 0, 0, task1.WIDTH, task1.HEIGHT);
        sb.draw(heli.getChopper(), heli.getPosition().x, heli.getPosition().y);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
