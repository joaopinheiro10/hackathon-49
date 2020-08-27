package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Hall;
import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;

public class HallView extends View{


    public HallView() {
        super(new Hall());
    }

    @Override
    public void init() {

        while(player.isAlive() || activeMap == HALL) {

            if (firstTime) {
                map.draw();
            }
            map.animate();
            player.move();
        }
    }
}
