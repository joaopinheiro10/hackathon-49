package org.academiadecodigo.felinux.GameObjects.map;

import org.academiadecodigo.felinux.GameObjects.GameObject;
import org.academiadecodigo.felinux.Services.GameCycle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Map {

    private MapType currentMap;


    public Map(MapType currentMap) {
        this.currentMap = currentMap;
    }


    public MapType getCurrentMap() {
        return currentMap;
    }

    public void setCurrentMap(MapType currentMap) {
        this.currentMap = currentMap;
    }

    public void draw() {
        GameCycle.imageMap.load(currentMap.getSource());
    }

    public void animate(){};
}
