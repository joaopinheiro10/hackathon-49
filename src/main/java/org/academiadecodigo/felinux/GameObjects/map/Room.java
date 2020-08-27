package org.academiadecodigo.felinux.GameObjects.map;
import org.academiadecodigo.felinux.GameObjects.drugs.Shroom;

import static org.academiadecodigo.felinux.GameObjects.map.MapType.*;

public class Room extends Map {

    public Room() {
        super(ROOM);
        roomShroom = new Shroom(this);
    }
    public void animate() {
        roomShroom.spawnShroom();
    }
}
