package org.academiadecodigo.felinux.GameObjects.model;

import org.academiadecodigo.felinux.tools.DirectionType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Dorothy extends AbstractModel {

    private float dx;
    private float dy;
    private int highnessLevel;
    private boolean alive;
    private int moveCounter;
    private boolean idle;
    private DirectionType prevDirection;


    public Dorothy() {
        this.prevDirection = DirectionType.BACK;
        direction = DirectionType.BACK;
        alive = true;
        image = new Picture(250,250, "img/chars/girl/IDLE_FRONT_1.png");
        idle = true;
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

        int[] position = {
                super.image.getX(),super.image.getY()
        };
        System.out.println(super.image.getX()+" "+super.image.getY());
        Picture imageToDelete = null;

        if(idle || talking){
            imageToDelete = super.image;
            super.image = new Picture(position[0],position[1],genIdleImage(direction));
            image.draw();
            imageToDelete.delete();
            return;
        }

        // 3 é o array de images, e caso, mude a direction
        // TODO aumentar pixeis
        if(moveCounter >= 3 || prevDirection != super.direction){
            moveCounter = 0;
        } else {
            moveCounter++;
        }

        imageToDelete = super.image;
        super.image = new Picture(position[0]+dx,position[1]+dy,super.direction.getImage(moveCounter));
        super.image.draw();
        imageToDelete.delete();

        prevDirection = direction;
    }

    /**
     * Interacts with random objects
     */
    public void interact() {}

    private String genIdleImage(DirectionType cdirection){

        return "/img/chars/girl/IDLE_"+ cdirection +"_1.png";
    }

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
