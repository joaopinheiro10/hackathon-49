package org.academiadecodigo.felinux.GameObjects;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {

    protected Picture image;

    public GameObject(Picture image) {
        this.image = image;
    }


}
