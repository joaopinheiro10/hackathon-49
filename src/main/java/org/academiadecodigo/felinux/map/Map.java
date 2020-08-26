package org.academiadecodigo.felinux.map;

import org.academiadecodigo.felinux.GameObjects.GameObject;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import static org.academiadecodigo.felinux.map.MapType.*;

public class Map extends GameObject {

    private MapType currentMap;

    public Map() {
        currentMap = ROOM;
        image = new Picture(50,50, currentMap.name());
        image.draw();
    }


    public MapType getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(MapType currentMap) {
        this.currentMap = currentMap;
    }
}
