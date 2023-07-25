package de.bitbrain.braingdx.graphics.animation;

import com.badlogic.gdx.graphics.g2d.Animation;

public class AnimationFrameParameters {
    private final AnimationFrames.Direction direction;
    private final Animation.PlayMode playMode;

    public AnimationFrameParameters(AnimationFrames.Direction direction, Animation.PlayMode playMode) {
        this.direction = direction;
        this.playMode = playMode;
    }

    public AnimationFrames.Direction getDirection() {
        return direction;
    }

    public Animation.PlayMode getPlayMode() {
        return playMode;
    }
}
