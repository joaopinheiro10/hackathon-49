package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Atrium;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;

public class AtriumView extends View {


    public AtriumView() {
        super(new Atrium());
    }

    @Override
    public void init() {

        while(player.isAlive() || activeMap == ATRIUM) {

            if (highnessMeter.getMeter() > 75) {
            } else {
                background.setHighEffect();
            }

            if (firstTime) {
                map.draw();
            }
            map.animate();
            player.move();
        }

        activeMap = PURGATORY;
    }
}
