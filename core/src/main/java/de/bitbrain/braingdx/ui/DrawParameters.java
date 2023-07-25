package de.bitbrain.braingdx.ui;

import com.badlogic.gdx.graphics.g2d.Batch;

public class DrawParameters {
    private final Batch batch;
    private final float x;
    private final float y;
    private final float width;
    private final float height;

    public DrawParameters(Batch batch, float x, float y, float width, float height) {
        this.batch = batch;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Add getters for each parameter if needed
    // Example:
    public Batch getBatch() {
        return batch;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}

