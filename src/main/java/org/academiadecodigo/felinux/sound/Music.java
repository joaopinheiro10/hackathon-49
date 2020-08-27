package org.academiadecodigo.felinux.sound;

import javax.sound.sampled.*;
import java.io.*;
import java.net.URL;

public class Music {
    private Clip clip;
    private URL soundURL;

    public Music(String path) {
        initClip(path);
    }

    public void play(boolean fromStart) {

        if (fromStart) {
            //clip.setFramePosition(1);
        }
        //clip.start();
    }

    public void stop() {
        clip.stop();
    }

    private void initClip(String path) {

        soundURL = Music.class.getResource(path); //if loading from jar
        AudioInputStream inputStream = null;

        try {

            if (soundURL == null) {
                path = path.substring(1);
                File file = new File(path);
                soundURL = file.toURI().toURL(); //if executing on intellij
            }

            inputStream = AudioSystem.getAudioInputStream(soundURL);
            clip = AudioSystem.getClip();
            clip.open(inputStream);

        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {

        }
    }
}
