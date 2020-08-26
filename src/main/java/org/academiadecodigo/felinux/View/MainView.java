package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.controller.PlayerKeyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.concurrent.Executor;
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

                        dorothy.move();

                        try {
                            Thread.sleep(30);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                });
    }
}
