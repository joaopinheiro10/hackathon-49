package org.academiadecodigo.felinux.GameObjects.drugs;

import org.academiadecodigo.felinux.GameObjects.GameObject;
import org.academiadecodigo.felinux.GameObjects.map.Map;
import org.academiadecodigo.felinux.Services.GameCycle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Shroom extends GameObject {

    private Picture shroom;
    private Map currentMap;
    private static int shroomCounter = 0;
    private static int maxShrooms = 10;

    public Shroom(Map currentMap) {
        this.currentMap = currentMap;
    }

    public void checkIfIsEaten(){

    }

    public void spawnShroom(){
        if(shroomCounter == maxShrooms){
            return;
        }
        shroomCounter++;

        int mapMinX = GameCycle.imageMap.getX();
        int mapMinY = GameCycle.imageMap.getY();

        int mapMaxX = GameCycle.imageMap.getMaxX();
        int mapMaxY = GameCycle.imageMap.getMaxY();

        int randomPosX = (int) Math.floor(Math.random() * mapMaxX);
        int randomPosY = (int) Math.floor(Math.random() * mapMaxY);

        while(randomPosX >= mapMaxX && randomPosX <= mapMinX){
            randomPosX = (int) Math.floor(Math.random() * mapMaxX);
        }
        while(randomPosY >= mapMaxY  && randomPosY <= mapMinY){
            randomPosY = (int) Math.floor(Math.random() * mapMaxY);
        }
        this.shroom = new Picture(randomPosX,randomPosY, "/img/element/shrooms/shroom.png");
        shroom.draw();
    }
}
