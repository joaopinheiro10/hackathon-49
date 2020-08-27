package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Map;
import org.academiadecodigo.felinux.GameObjects.map.Room;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.extras.Background;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;

import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;
import static org.academiadecodigo.felinux.GameObjects.map.MapType.HALL;

public abstract class View {

    protected Dorothy player;
    protected Map map;
    protected boolean firstTime;
    protected Background background;
    protected HighnessMeter highnessMeter;

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
    public void init() {

        while(player.isAlive() || activeMap == HALL) {

            if (firstTime) {
                map.draw();
                firstTime = false;
            }
            map.animate();
            player.move();
        }
    };

    public void setHighnessMeter(HighnessMeter highnessMeter) {
        this.highnessMeter = highnessMeter;
    }
}
