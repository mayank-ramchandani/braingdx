package de.bitbrain.braingdx.graphics.animation;

import com.badlogic.gdx.graphics.g2d.Animation;

public class FrameParameters {
    private final int originX;
    private final int originY;
    private final AnimationFrames.Direction direction;
    private final Animation.PlayMode playMode;
    private final int frames;
    private final float duration;
    private final int resetIndex;
    private final float offset;
    private final boolean randomOffset;

    public FrameParameters(int originX, int originY, AnimationFrames.Direction direction, Animation.PlayMode playMode, int frames, float duration, int resetIndex, float offset, boolean randomOffset) {
        this.originX = originX;
        this.originY = originY;
        this.direction = direction;
        this.playMode = playMode;
        this.frames = frames;
        this.duration = duration;
        this.resetIndex = resetIndex;
        this.offset = offset;
        this.randomOffset = randomOffset;
    }

    public int getOriginX() {
        return originX;
    }

    public int getOriginY() {
        return originY;
    }

    public AnimationFrames.Direction getDirection() {
        return direction;
    }

    public Animation.PlayMode getPlayMode() {
        return playMode;
    }

    public int getFrames() {
        return frames;
    }

    public float getDuration() {
        return duration;
    }

    public int getResetIndex() {
        return resetIndex;
    }

    public float getOffset() {
        return offset;
    }

    public boolean isRandomOffset() {
        return randomOffset;
    }
}
