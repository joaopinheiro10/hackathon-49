package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Hall;
import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;
import static org.academiadecodigo.felinux.Services.GameCycle.imageMap;

public class HallView extends View{


    public HallView() {
        super(new Hall());
    }

    @Override
    public void init() {

        while(player.isAlive() || activeMap == HALL) {

            if (highnessMeter.getMeter() > 75) {
            } else {
                background.setHighEffect();
            }

            if (firstTime) {
                imageMap.load(activeMap.getSource());
            }
            map.animate();
            player.move();
        }

        activeMap = ATRIUM;
    }
}
