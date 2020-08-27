package org.academiadecodigo.felinux.GameObjects.model;

import org.academiadecodigo.felinux.View.extras.HighnessMeter;
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


    public Dorothy() {
        this.prevDirection = DirectionType.BACK;
        direction = DirectionType.BACK;
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
        System.out.println(super.image.getX() + " "+super.image.getY());

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

        super.image.load(direction.getImage(moveCounter));
        super.image.translate(dx,dy);

        //imageToDelete = super.image;
        //super.image = new Picture(position[0]+dx,position[1]+dy,super.direction.getImage(moveCounter));
        //super.image.draw();
        //imageToDelete.delete();

        prevDirection = direction;
    }

    /**
     * Interacts with random objects
     * @param player receives the player image (Picture)
     * @param interactable receives the interactable object image (Picture)
     */
    public boolean interact(Picture player, Picture interactable) {

        int xA = ((player.getX())*2+player.getWidth())/2;
        int yA = ((player.getY())*2+player.getHeight())/2;

        int xB = (interactable.getX()*2+interactable.getWidth())/2;
        int yB = (interactable.getY()*2+interactable.getHeight())/2;

        int distance = ( interactable.getWidth()+player.getWidth() )/2;
        return getDistance(xA,yA,xB,yB)<=distance;
    }
    /**
     * Almighty God, calculator of distance, ruler of the maths
     * Aka DONT TOUCH
     * @param xA
     * @param yA
     * @param xB
     * @param yB
     * @return the distance between 2 points
     */
    private static double getDistance(double xA, double yA, double xB, double yB){

        return Math.sqrt(Math.pow((xA-xB),2)+Math.pow((yA-yB),2));
    }

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
