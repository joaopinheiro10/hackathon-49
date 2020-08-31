package org.academiadecodigo.felinux.GameObjects.model;

import org.academiadecodigo.felinux.View.extras.HighnessMeter;
import org.academiadecodigo.felinux.tools.DirectionType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Dorothy extends AbstractModel {

    private float dx;
    private float dy;
    private boolean alive;
    private int moveCounter;
    private boolean idle;
    private DirectionType prevDirection;
    private String lastSprite = "/img/chars/oldLady/OLD_IDLE_FRONT.png";
    private int[][] positions;
    private int xPos = 250;
    private int yPos = 250;
    private boolean decision;


    public Dorothy() {
        this.prevDirection = DirectionType.BACK;
        direction = DirectionType.BACK;
        alive = true;
        setPositions();
        image = new Picture(xPos,yPos, "img/chars/girl/IDLE_BACK.png");
        idle = true;
    }

    public void setPositions() {
        positions = new int[][] {
                new int[]{250, 250},
                new int[]{234, 406},
                new int[]{542, 342},
                new int[]{602, 442}
        };
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
            super.image.load((HighnessMeter.meter<=65)?"/img/chars/oldLady/OLD_IDLE_"+ direction +".png"
                    :"/img/chars/girl/IDLE_" + direction +".png");
            return;
        }
        System.out.println(image.getX() + " " + image.getY());
        if(moveCounter >= 3 || prevDirection != super.direction){
            moveCounter = 0;
        } else {
            moveCounter++;
        }

        super.image.load((HighnessMeter.meter<=65)?direction.getOldImages(moveCounter):direction.getImage(moveCounter));

        super.image.translate(dx,dy);
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
     * @param xA
     * @param yA
     * @param xB
     * @param yB
     * @return the distance between 2 points
     */
    private static double getDistance(double xA, double yA, double xB, double yB){

        return Math.sqrt(Math.pow((xA-xB),2)+Math.pow((yA-yB),2));
    }
    public void setDecision(boolean decision) {
        this.decision = decision;
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

    public DirectionType getPrevDirection() {
        return prevDirection;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public int[][] getPositions() {
        return positions;
    }
}


