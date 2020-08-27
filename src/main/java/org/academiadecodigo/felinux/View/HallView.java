package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Hall;
import org.academiadecodigo.felinux.GameObjects.map.MapType;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;
import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;
import static org.academiadecodigo.felinux.Services.GameCycle.imageMap;

public class HallView extends View {


    public HallView() {
        super(new Hall());
    }

    public void init(HighnessMeter hm, MapType mapType) {
        while (player.isAlive() && activeMap == mapType) {

            if (HighnessMeter.meter > 75) {

                background.setHighEffect();
            } else {
                background.setHighEffect();
            }

            if (firstTime) {
                imageMap.draw();
                player.getImage().draw();
                firstTime = false;
            }

            hm.animate();
            map.animate();
            player.move();

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        activeMap = ATRIUM;
        imageMap.delete();
        player.getImage().delete();
    }
}


