package org.academiadecodigo.felinux.sound;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class PlaySound {
    public PlaySound(){
        AudioInputStream audioIn = null;
        try {
            audioIn = AudioSystem.getAudioInputStream(new File("sounds/Depressed_Somewhere_Over_the_Rainbow_OLD.mp3"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


    }
}
