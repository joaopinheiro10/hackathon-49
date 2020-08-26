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
        this.prevDirection = DirectionType.DOWN;
        direction = DirectionType.DOWN;
    }

    public int getHighnessLevel() {
        return highnessLevel;
    }


    public boolean isAlive() {
        return alive;
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

        //TODO get idle to animate
        if(talking || idle){
            return;
        }

        int[] position = {
                super.image.getX(),super.image.getY()
        };
        System.out.println("adeus " + super.direction.getImage(moveCounter));

        //3 é o array de images, e caso, mude a direction
        if(moveCounter >= 3 || prevDirection != super.direction){
            moveCounter = 0;
        } else {
            moveCounter++;
        }

        super.image.delete();
        super.image = new Picture(position[0], position[1], super.direction.getImage(moveCounter));
        super.image.draw();
        prevDirection = direction;
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
