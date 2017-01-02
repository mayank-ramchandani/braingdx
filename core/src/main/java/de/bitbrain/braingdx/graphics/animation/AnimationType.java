/* Copyright 2016 Miguel Gonzalez Sanchez
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.bitbrain.braingdx.graphics.animation;

/**
 * An animation type describes the behavior of frames which belong to a certain animation.
 * 
 * @author Miguel Gonzalez Sanchez
 * @version 1.0.0
 */
public interface AnimationType {

    /**
     * Updates the given frame and returns it. This operation is immutable.
     * 
     * @param currentFrame the current frame
     * @param totalFrames number of total frames
     * @return the optionally modified current frame
     */
    int updateCurrentFrame(int lastFrame, int currentFrame, int totalFrames, int origin);
}
