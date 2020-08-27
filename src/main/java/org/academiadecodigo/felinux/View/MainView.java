package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.extras.Background;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;
import org.academiadecodigo.felinux.controller.PlayerKeyboard;
import org.academiadecodigo.felinux.GameObjects.map.Purgatory;
import org.academiadecodigo.felinux.sound.Music;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainView {

    public MainView(){
        startGame();
    }

    public void startGame(){
        Music music = new Music("/sounds/Depressed_Somewhere_Over_the_Rainbow_OLD_WAV.mp3");
        music.play(true);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        final Background background = new Background();
        final Dorothy dorothy = new Dorothy();
        PlayerKeyboard keyboard = new PlayerKeyboard(dorothy);

        //TODO criar classe for purgatory
        final PurgatoryView purgatory = new PurgatoryView();
        purgatory.setPlayer(dorothy);
        final HighnessMeter highnessMeter = new HighnessMeter();

        /**
         * Game Loop
         */
        executorService.execute(
            new Runnable() {
                @Override
                public void run() {

                    while (true) {

                        if (dorothy.getHighnessLevel() > 75) {
                        } else {
                            background.setHighEffect();
                        }
                        purgatory.init();
                        //purgatory.animate();
                        //map.draw();
                        dorothy.move();
                        highnessMeter.animate();

                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        );
    }
}
