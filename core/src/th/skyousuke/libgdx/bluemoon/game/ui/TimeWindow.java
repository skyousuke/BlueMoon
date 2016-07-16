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

package th.skyousuke.libgdx.bluemoon.game.ui;

import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.Align;

import th.skyousuke.libgdx.bluemoon.framework.LanguageManager;
import th.skyousuke.libgdx.bluemoon.game.WorldTime;

/**
 * Game time window class
 * Created by Skyousuke <surasek@gmail.com> on 12/7/2559.
 */
public class TimeWindow extends Window {

    private Label timeLabel;

    public TimeWindow(Skin skin) {
        super(skin);
        setMovable(false);

        timeLabel = LabelPool.obtainLabel();
        timeLabel.setAlignment(Align.center);
        row();
        add(timeLabel).expand().fill().padTop(5f).padBottom(5f);
        padLeft(10f);
        padRight(10f);
        setTime(0, 0, 0);
        pack();
        setWidth(85f);
    }

    public void initContent() {
        setTime(0, 0, 0);
        setTitle(LanguageManager.instance.getText("timeWindowTitle"));
    }

    public void setTime(WorldTime time) {
        setTime(time.getDays(), time.getHours(), time.getMintues());
    }

    public void setTime(int days, int hours, int minutes) {
        timeLabel.setText(String.format("%s\n%02d:%02d",
                LanguageManager.instance.getFormattedText("day", days), hours, minutes));
    }

}
