package org.academiadecodigo.felinux.GameObjects.model;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Fire {

    private int counter = 0;

    private Picture fire = new Picture(185,170, "/img/element/fire/fire_1.png");

    public Fire(){
        fire.draw();
    }

    public void animate(){

        this.fire.delete();

        counter++;
        if(counter == 15){
            counter = 1;
        }
        fire = new Picture(185,170, "/img/element/fire/fire_" + counter + ".png");
        fire.draw();
    }
}
