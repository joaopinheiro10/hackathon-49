package org.academiadecodigo.felinux.View;

import java.awt.*;

public class HighnessMeter {
    private int meter = 50;
    private int x = 200;
    private int y = 20;
    private Rectangle rectangle = new Rectangle(20, 20, x, y);

    public HighnessMeter() {
    }

    public void animate() {
        if (x < 1000 && y < 1000) {
            this.rectangle.translate(x++, y++);
            //System.out.println(rectangle.getX() + " " + rectangle.getY());
        }
    }
}
