package org.academiadecodigo.felinux.map;

import org.academiadecodigo.felinux.GameObjects.GameObject;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import static org.academiadecodigo.felinux.map.MapType.*;

public class Map extends GameObject {

    private MapType currentMap;
    private MapType previousMap;

    public Map() {
        currentMap = ATRIUM;
        previousMap = ATRIUM;
        image = new Picture(50,50, currentMap.getSource());
    }


    public MapType getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(MapType currentMap) {
        this.currentMap = currentMap;
    }

    public void draw() {
        if(currentMap != previousMap) {
            image.delete();
            image = new Picture(50,50, currentMap.getSource());
            image.draw();
            previousMap = currentMap;
            return;
        }
    }
}
