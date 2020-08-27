package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Atrium;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;

public class AtriumView extends View {


    public AtriumView() {
        super(new Atrium());
    }

    @Override
    public void init(HighnessMeter hm) {

        while(player.isAlive() || activeMap == ATRIUM) {

            if (HighnessMeter.meter > 75) {
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
