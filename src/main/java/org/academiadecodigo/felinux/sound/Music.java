package org.academiadecodigo.felinux.sound;

import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.HighnessMeter;
import javax.sound.sampled.*;
import java.io.*;
import java.net.URL;

public class Music {
    private Clip clip;
    private URL soundURL;


    public Music(String path) {
        initClip(path);
    }



    public void play(Dorothy player, HighnessMeter highnessMeter, SoundEffect soundEffect) {



        if (highnessMeter.getMeter() <= 65) {

        }


        if(highnessMeter.getMeter() >= 65 && <= 195) {


        }

        if(highnessMeter.getMeter() >=195) {

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
