package org.academiadecodigo.felinux.GameObjects.model;

import org.academiadecodigo.felinux.View.HighnessMeter;
import org.academiadecodigo.felinux.tools.DirectionType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Dorothy extends AbstractModel {

    private float dx;
    private float dy;
    private HighnessMeter highnessMeter;
    private boolean alive;
    private int moveCounter;
    private boolean idle;
    private DirectionType prevDirection;
    private String lastSprite = "/img/chars/oldLady/IDLE_FRONT_1.png";


    public Dorothy() {
        this.prevDirection = DirectionType.GIRL_BACK;
        direction = DirectionType.GIRL_BACK;
        alive = true;
        image = new Picture(250,250, "img/chars/girl/IDLE_FRONT_1.png");
        idle = true;
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
        Picture imageToDelete = null;
        //System.out.println(super.image.getX() + " "+super.image.getY());

        if(idle || talking){
            imageToDelete = super.image;
            super.image = new Picture(position[0], position[1], genIdleImage(direction));
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
        super.image = new Picture(position[0]+dx,position[1]+dy, super.direction.getImage(moveCounter));
        super.image.draw();
        imageToDelete.delete();

        prevDirection = direction;
    }

    /**
     * Interacts with random objects
     */
    public void interact() {}

    private String genIdleImage(DirectionType cdirection){
        if(HighnessMeter.meter >= 195){
            lastSprite = "/img/chars/girl/IDLE_"+ cdirection +"_1.png";
            return lastSprite;
        }
        if(HighnessMeter.meter <= 65){
            lastSprite = "/img/chars/oldLady/IDLE_FRONT_1.png";
            return lastSprite;
        }
        return lastSprite;
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
