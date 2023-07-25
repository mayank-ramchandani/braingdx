package de.bitbrain.braingdx.graphics.animation;

public class OriginParameters {
    private final int originX;
    private final int originY;

    public OriginParameters(int originX, int originY) {
        this.originX = originX;
        this.originY = originY;
    }

    public int getOriginX() {
        return originX;
    }

    public int getOriginY() {
        return originY;
    }
}
