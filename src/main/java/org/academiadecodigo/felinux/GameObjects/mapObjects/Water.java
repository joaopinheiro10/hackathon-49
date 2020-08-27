package org.academiadecodigo.felinux.GameObjects.mapObjects;

import org.academiadecodigo.felinux.GameObjects.GameObject;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Water extends GameObject {

    private int counter = 0;
    private final String src = "/img/element/water/water_1.png";


    public Water(){
        image = new Picture(480,240, src);

    }

    /**
     * Creates movement for water
     */
    public void animate(){

        if(counter == 0) {
            image.draw();
        }

        counter++;

        if(counter >= 9){
            counter = 1;
            image.delete();
            image = new Picture(480,240, "/img/element/water/water_" + counter + ".png");
            image.draw();
            return;
        }

        image.load("/img/element/water/water_" + counter + ".png");

    }
}
