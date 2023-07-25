package de.bitbrain.braingdx.graphics.animation;

import com.badlogic.gdx.graphics.g2d.Animation;

public class AnimationFrames {

   public enum Direction {
      HORIZONTAL,
      VERTICAL
   }

   private int originX, originY;
   private Direction direction;
   private Animation.PlayMode playMode;
   private int frames;
   private float duration;
   private int resetIndex;
   private float offset;
   private boolean randomOffset;

   private AnimationFrames(FrameParameters frameParameters) {
      this.originX = frameParameters.getOriginX();
      this.originY = frameParameters.getOriginY();
      this.direction = frameParameters.getDirection();
      this.playMode = frameParameters.getPlayMode();
      this.frames = frameParameters.getFrames();
      this.duration = frameParameters.getDuration();
      this.resetIndex = frameParameters.getResetIndex();
      this.offset = frameParameters.getOffset();
      this.randomOffset = frameParameters.isRandomOffset();
   }

   public float getOffset() {
      return offset;
   }

   public boolean isRandomOffset() {
      return randomOffset;
   }

   public void setOriginX(int originX) {
      this.originX = originX;
   }

   public void setOriginY(int originY) {
      this.originY = originY;
   }

   public void setResetIndex(int index) {
      this.resetIndex = index;
   }

   public int getResetIndex() {
      return resetIndex;
   }

   public void setDirection(Direction direction) {
      this.direction = direction;
   }

   public void setPlayMode(Animation.PlayMode playMode) {
      this.playMode = playMode;
   }

   public void setFrames(int frames) {
      this.frames = frames;
   }

   public void setDuration(float duration) {
      this.duration = duration;
   }

   public static AnimationFramesBuilder builder() {
      return new AnimationFramesBuilder();
   }

   public int getOriginX() {
      return originX;
   }

   public int getOriginY() {
      return originY;
   }

   public Direction getDirection() {
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

   public static class AnimationFramesBuilder {

      private int originX, originY;
      private Direction direction = Direction.HORIZONTAL;
      private Animation.PlayMode playMode = Animation.PlayMode.LOOP;
      private int frames = 1;
      private float duration = 1f;
      private int resetIndex = 0;
      private float offset = 0;
      private boolean randomOffset;

      private AnimationFramesBuilder() {

      }

      public AnimationFramesBuilder origin(int originX, int originY) {
         this.originX = originX;
         this.originY = originY;
         return this;
      }

      public AnimationFramesBuilder direction(Direction direction) {
         this.direction = direction;
         return this;
      }

      public AnimationFramesBuilder playMode(Animation.PlayMode playMode) {
         this.playMode = playMode;
         return this;
      }

      public AnimationFramesBuilder frames(int frames) {
         this.frames = frames;
         return this;
      }

      public AnimationFramesBuilder duration(float duration) {
         this.duration = duration;
         return this;
      }

      public AnimationFramesBuilder resetIndex(int resetIndex) {
         this.resetIndex = resetIndex;
         return this;
      }

      public AnimationFramesBuilder offset(float offsetInMilliseconds) {
         this.offset = offsetInMilliseconds;
         return this;
      }

      public AnimationFramesBuilder randomOffset() {
         randomOffset = true;
         return this;
      }

      public AnimationFrames build() {
         return new AnimationFrames(
                 new FrameParameters(originX, originY, direction, playMode, frames, duration, resetIndex, offset, randomOffset));
      }

   }
}
