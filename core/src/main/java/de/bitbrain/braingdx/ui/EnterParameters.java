package de.bitbrain.braingdx.ui;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

public class EnterParameters {
    private final InputEvent event;
    private final float x;
    private final float y;
    private final int pointer;
    private final Actor fromActor;

    public EnterParameters(InputEvent event, float x, float y, int pointer, Actor fromActor) {
        this.event = event;
        this.x = x;
        this.y = y;
        this.pointer = pointer;
        this.fromActor = fromActor;
    }

    // Add getters for each parameter if needed
    // Example:
    public InputEvent getEvent() {
        return event;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getPointer() {
        return pointer;
    }

    public Actor getFromActor() {
        return fromActor;
    }
}

