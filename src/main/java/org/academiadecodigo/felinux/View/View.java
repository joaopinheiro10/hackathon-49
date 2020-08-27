package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Map;
import org.academiadecodigo.felinux.GameObjects.map.MapType;
import org.academiadecodigo.felinux.GameObjects.map.Room;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.extras.Background;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.ROOM;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;
import static org.academiadecodigo.felinux.GameObjects.map.MapType.HALL;
import static org.academiadecodigo.felinux.Services.GameCycle.imageMap;

public abstract class View {

    protected Dorothy player;
    protected Map map;
    protected boolean firstTime;
    protected Background background;

    public View(Map map) {
        this.map = map;
        this.firstTime = true;
        background = new Background();
    }

    /**
     * Only one player for the game
     * @param player
     */
    public void setPlayer(Dorothy player) {
        this.player = player;
    }

    /**
     * Defines what happens inside each view
     */
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
    }
}
