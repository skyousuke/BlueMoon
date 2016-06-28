/*
 * Copyright 2016 Surasek Nusati <surasek@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package th.skyousuke.libgdx.bluemoon.game.object.character;

/**
 * Created by Skyousuke <surasek@gmail.com> on 27/6/2559.
 */
public abstract class CharacterState {

    protected AbstractCharacter character;

    public void update(float deltaTime) {
        setAnimation();
        updateCharacter(deltaTime);
    }

    protected abstract void updateCharacter(float deltaTime);

    protected abstract void setAnimation();

    public void handleInput() {
    }

    public void enter() {
    }

    public void exit() {
    }

    public void setCharacter(AbstractCharacter character) {
        this.character = character;
    }

}
