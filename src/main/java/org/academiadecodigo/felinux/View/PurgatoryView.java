package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Map;
import org.academiadecodigo.felinux.GameObjects.map.Purgatory;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.PURGATORY;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;
import static org.academiadecodigo.felinux.Services.GameCycle.imageMap;


public class PurgatoryView extends View{


    public PurgatoryView() {
        super(new Purgatory());
    }

    @Override
    public void init() {

        while(player.isAlive() || activeMap == PURGATORY) {

            if (highnessMeter.getMeter() > 75) {
            } else {
                background.setHighEffect();
            }

            if (firstTime) {
                imageMap.load(activeMap.getSource());
                firstTime = false;
            }


            map.animate();
            player.move();
        }
    }
}
