package de.bitbrain.braingdx.graphics.animation;

public class offsetParameters {
    private final float offset;
    private final boolean randomOffset;

    public offsetParameters(float offset, boolean randomOffset) {
        this.offset = offset;
        this.randomOffset = randomOffset;
    }

    public float getOffset() {
        return offset;
    }

    public boolean isRandomOffset() {
        return randomOffset;
    }
}
