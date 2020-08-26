package org.academiadecodigo.felinux.View;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;

public class Background{

    private Rectangle rectangle = new Rectangle(5,5,1000,600);
    private int red = 0;
    private int green = 0;
    private int blue = 0;

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    //Done
    public void setHighEffect() {

        while (true) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(red >= 200){
                red = 30;
            }
            if(green >= 200){
                green = 150;
            }
            if(blue >= 200){
                blue = 50;
            }
            red++;
            green += 10;
            blue += 10;
            this.rectangle.setColor(new Color(red, green, blue));
            this.rectangle.fill();
        }
    }

    public void setDepressedEffect() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(red >= 200){
                red = 50;
            }
            if(green >= 200){
                green = 50;
            }
            if(blue >= 200){
                blue = 50;
            }
            for (red = 50; red <= 255; red++) {
                for (green = 50; green <= 255; green++) {
                    for (blue = 50; blue <= 255; blue++) {
                        this.rectangle.setColor(new Color(red, green, blue));
                        this.rectangle.fill();
                    }
                }
            }
        }
    }

}
