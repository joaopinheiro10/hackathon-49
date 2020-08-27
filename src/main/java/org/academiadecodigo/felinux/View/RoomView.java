package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.Room;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;

public class RoomView extends View{

    public RoomView() {
        super(new Room());
    }

    /**
     * Method to create loop inside this room
     */
    @Override
    public void init(HighnessMeter hm) {

        while(player.isAlive() && activeMap == ROOM) {

            if (firstTime) {
                map.draw();
                firstTime = false;
            }

            map.animate();
            player.move();
        }

    }
}
