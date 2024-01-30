package com.william.task1.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

public class Heli {

    public static int GRAVITY = -15;
    public static int DRIFT = 15;
    private Vector3 position;
    private Vector3 velocity;
    private Texture heli;

    private Rectangle bounds;

    public Heli(int x, int y) {
        position = new Vector3(x,y,0);
        velocity = new Vector3(0,0,0);
        heli = new Texture("attackhelicopter.PNG");
        bounds = new Rectangle(x,y,heli.getWidth(),heli.getHeight());
    }

    public void update(float dt) {
        if (position.x < 0) {
            velocity.add(DRIFT, 0, 0);
        }
    }

}
