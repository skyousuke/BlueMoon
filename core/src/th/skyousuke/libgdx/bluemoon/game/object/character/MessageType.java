/*
 * Copyright 2016 Surasek Nusati <surasek@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package th.skyousuke.libgdx.bluemoon.game.object.character;

/**
 * Message type class for ai system.
 * Created by S.Kyousuke <surasek@gmail.com> on 18/7/2559.
 */
public class MessageType {

    public static final int WALK_UP = 0;
    public static final int WALK_DOWN = 1;
    public static final int WALK_LEFT = 2;
    public static final int WALK_RIGHT = 3;
    public static final int SAY_MSG = 4;

    private MessageType() {
    }

}
