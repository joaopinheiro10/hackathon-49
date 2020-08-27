package org.academiadecodigo.felinux.sound;

import org.academiadecodigo.felinux.View.HighnessMeter;

import javax.sound.sampled.Clip;


public class Music {

    private Clip clip;



    public void play(HighnessMeter highnessMeter, SoundEffect soundEffect) {


        if (highnessMeter.getMeter() <= 65) {
            play(highnessMeter, SoundEffect.DEPRESSED);
        }

        if (highnessMeter.getMeter() >= 65 && <= 195){
            play(highnessMeter, SoundEffect.NORMAL);

        }

        if (highnessMeter.getMeter() >= 195) {
            play(highnessMeter, SoundEffect.HIGH);
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
