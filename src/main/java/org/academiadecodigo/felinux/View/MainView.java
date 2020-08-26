package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.controller.PlayerKeyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainView {
    public MainView(){
        startGame();
    }
    public void startGame(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        final Background background = new Background();
        final Dorothy dorothy = new Dorothy();
        PlayerKeyboard keyboard = new PlayerKeyboard(dorothy);

        //TODO criar classe for purgatory
        final Picture purgatory = new Picture(100, 50, "/img/mansion/purgatory/purgatory.png");

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
                    purgatory.draw();
                    /*dorothy.setImage(new Picture(50,50, "/img/chars/girl/DEAD_LEFT_1.png"));
                    //TODO joel
                    dorothy.move();*/
                }
            }
        });
    }
}
