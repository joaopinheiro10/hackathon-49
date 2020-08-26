package org.academiadecodigo.felinux.View;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;

public class Background  {

    private Rectangle rectangle = new Rectangle(5,5,800,600);
    private static int red = 0;
    private static int green = 0;
    private static int blue = 0;

    public Rectangle getRectangle() {
        return rectangle;
    }

    //Done
    public void setHighEffect() {

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

    public void setDepressedEffect() {

        if(red >= 200){
            red = 50;
        }
        if(green >= 200){
            green = 50;
        }
        if(blue >= 200){
            blue = 50;
        }
        this.rectangle.setColor(new Color(red, green, blue));
        this.rectangle.fill();
    }
}
