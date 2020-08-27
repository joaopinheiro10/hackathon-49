package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.drugs.Shroom;
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

    public View(Map map) {
        this.firstTime = true;
        this.background = new Background();
        this.map = map;
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
    public void init(HighnessMeter hm) {

        while(player.isAlive() || activeMap == HALL) {

            if (firstTime) {
                map.draw();
                firstTime = false;
            }
            map.animate();
            player.move();
        }
    };
}
