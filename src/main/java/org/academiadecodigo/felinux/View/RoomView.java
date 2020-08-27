package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.map.MapType;
import org.academiadecodigo.felinux.GameObjects.map.Room;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;
import static org.academiadecodigo.felinux.Services.GameCycle.activeMap;
import static org.academiadecodigo.felinux.Services.GameCycle.imageMap;

public class RoomView extends View{

    public RoomView() {
        super(new Room());
    }

    @Override
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

        activeMap = HALL;
        imageMap.delete();
        imageMap = new Picture(50,50, activeMap.getSource());
        player.getImage().delete();
    }
}
