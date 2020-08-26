package org.academiadecodigo.felinux.View;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.springframework.beans.factory.annotation.Autowired;

public class Background  {

    private Rectangle rectangle = new Rectangle(5,5,1000,600);
    private static int red = 0;
    private static int green = 0;
    private static int blue = 0;


    //Done
    public void setHighEffect() {
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

    public void setDepressedEffect() {
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
                        this.rectangle.setColor(new Color(red, green, blue));
                        this.rectangle.fill();

    }

}
