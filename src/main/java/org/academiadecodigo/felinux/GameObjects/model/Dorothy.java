package org.academiadecodigo.felinux.GameObjects.model;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Dorothy extends AbstractModel {

    private float dx;
    private float dy;
    private int highnessLevel;
    private boolean alive;

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
    public void move(){}

    /**
     * Interacts with random objects
     */
    public void interact() {}
}
