package org.academiadecodigo.felinux.GameObjects.model;

import org.academiadecodigo.felinux.tools.DirectionType;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.springframework.core.SpringVersion;

public class Dorothy extends AbstractModel {

    private float dx;
    private float dy;
    private int highnessLevel;
    private boolean alive;
    private int moveCounter;
    private boolean idle;
    private DirectionType prevDirection;

    public Dorothy() {
    }

    public int getHighnessLevel() {
        return highnessLevel;
    }

    public void setHighnessLevel(int highnessLevel) {
        this.highnessLevel = highnessLevel;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public float getDx() {
        return dx;
    }

    public void setDx(float dx) {
        this.dx = dx;
    }

    public float getDy() {
        return dy;
    }

    public void setDy(float dy) {
        this.dy = dy;
    }

    /**
     * Moves player
     */
    public void move(){

        if(idle){

            return;
        }

        if(!talking){

            return;
        }

        int[] direction = {super.image.getX(),super.image.getY()};

        //3 é o array de images, e caso, mude a direction
        if(moveCounter>=3||prevDirection!=super.direction){

            moveCounter=0;
        }else{
            moveCounter++;
        }

        super.image.delete();
        super.image = new Picture(direction[0],direction[1],super.direction.getImage(moveCounter));
        super.image.draw();
    }

    /**
     * Interacts with random objects
     */
    public void interact() {}

    public int getMoveCounter() {
        return moveCounter;
    }

    public void setMoveCounter(int moveCounter) {
        this.moveCounter = moveCounter;
    }

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean status) {
        this.idle = status;
    }
}
