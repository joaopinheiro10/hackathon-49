package org.academiadecodigo.felinux.View.extras;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.HashMap;
import java.util.Map;


public class HighnessMeter {

    //MIN = 0     MAX = 260
    //25% = 65 ;  50% = 130   ;   75% = 195
    private int meter = 260;

    private Picture meterBar = new Picture(5,20 + 465,"/meter/meter.png");
    private Rectangle rectangle = new Rectangle(109, 73 + 465, meter, 36);

    private boolean goingRight = false;

    private Map<String, Integer> highness = new HashMap();

    public HighnessMeter() {
        rectangle.setColor(new Color(10,10,255));

        //VELHA
        highness.put("0%",0);
        highness.put("25%",65);

        highness.put("50%",130);

        //CRIANCA
        highness.put("75%", 195);
        highness.put("100%", 260);

    }

    public void animate() {
       if(meter > 259){
            goingRight = false;
        } else if(meter <= 0){
            goingRight = true;
        }
       //Depressed
        if(meter <= 65){
            rectangle.setColor(new Color(57,77,255));
        } //Normal
        else if( meter > 65 && meter <= 165){
            rectangle.setColor(new Color(250,194,27));
        } //High
        else if( meter > 165){
            rectangle.setColor(new Color(250,27,27));
        }

        if (goingRight) {
            this.rectangle.translate(1, 0);
            this.rectangle.grow(1,0);
            this.meter += 2;
            //System.out.println(rectangle.getX() + " " + rectangle.getY());
        } else{
            this.rectangle.translate(-1, 0);
            this.rectangle.grow(-1,0);
            this.meter -= 2;
        }
        meterBar.draw();
        rectangle.fill();
    }
    public Map<String, Integer> getHighness() {
        return highness;
    }

    public int getMeter() {
        return meter;
    }
    public Map<String, Integer> getHighness() {
        return highness;
    }

    public int getMeter() {
        return meter;
    }
}
