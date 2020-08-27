package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Atrium;
import org.academiadecodigo.felinux.GameObjects.map.MapType;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;
import static org.academiadecodigo.felinux.Services.GameCycle.imageMap;

public class AtriumView extends View {


    public AtriumView() {
        super(new Atrium());
    }

    public void init(HighnessMeter hm, MapType mapType) {
        int counter =0;
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

        imageMap.delete();
        player.getImage().delete();
        activeMap = PURGATORY;
    }

}
