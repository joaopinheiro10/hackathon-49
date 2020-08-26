package org.academiadecodigo.felinux.GameObjects.model;

import org.academiadecodigo.felinux.GameObjects.GameObject;
import org.academiadecodigo.felinux.tools.DirectionType;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class AbstractModel extends GameObject {

    protected DirectionType direction;
    protected boolean canMove;


    public AbstractModel(Picture image) {
        super(image);
    }
}
