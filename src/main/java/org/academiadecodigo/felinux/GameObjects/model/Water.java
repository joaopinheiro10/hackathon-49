package org.academiadecodigo.felinux.GameObjects.model;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Water {

    private int counter = 0;

    private Picture water = new Picture(496,180, "/img/element/water/water_1.png");

    public Water(){
        water.draw();
    }

    public void animate(){
        this.water.delete();
        counter++;
        if(counter == 9){
            counter = 1;
            water = new Picture(480,240, "/img/element/water/water_" + counter + ".png");
            return;
        }
        water = new Picture(480,284, "/img/element/water/water_" + counter + ".png");
        water.draw();
    }
}
