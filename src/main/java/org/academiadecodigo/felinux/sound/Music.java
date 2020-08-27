
package org.academiadecodigo.felinux.sound;

import org.academiadecodigo.felinux.View.extras.HighnessMeter;



public class Music {

    private Sound sound;


    public void play() {


        if (HighnessMeter.meter <= 65) {
            sound = new Sound(SoundEffect.DEPRESSED.soundPath);
        }

        if (HighnessMeter.meter >= 65 && HighnessMeter.meter <= 195){
            sound = new Sound(SoundEffect.NORMAL.soundPath);

        }

        if (HighnessMeter.meter >= 195) {
            sound = new Sound(SoundEffect.HIGH.soundPath);
        }

        }

    }

    enum SoundEffect {

        DEPRESSED("/resources/sounds/Depressed_Somewhere_Over_the_Rainbow_OLD.mp3"),
        HIGH("/resources/sounds/High_Somewhere_Over_the_Rainbow_OLD.mp3"),
        NORMAL("/resources/sounds/Somewhere_Over_the_Rainbow_OLD.mp3");

        public String soundPath;

        SoundEffect(String soundPath) {
            this.soundPath = soundPath;
        }


}

