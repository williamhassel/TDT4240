package com.william.task1.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

public class Heli {
    public static int DRIFT = 5;
    private Vector3 position;
    private Vector3 velocity;
    private Texture heli;

    private Sprite chopper;

    private Rectangle bounds;

    public Heli(int x, int y) {
        position = new Vector3(x,y,0);
        velocity = new Vector3(DRIFT,0,0);
        heli = new Texture("heli1.PNG");
        chopper = new Sprite(heli);
        bounds = new Rectangle(x,y,heli.getWidth(),heli.getHeight());
    }

    public void update(float dt) {
        if (position.x + bounds.getWidth() > 500 && velocity.x > 0) {
            velocity.set(-DRIFT,0,0);
        }
        if (position.x < 0 && velocity.x < 0) {
            velocity.set(DRIFT, 0, 0);
        }

        position.add(velocity.x,0,0);
    }

    public Vector3 getPosition() {
        return position;
    }

    public Texture getTexture() {
        return heli;
    }

    public Sprite getChopper() {
        return chopper;
    }


}
