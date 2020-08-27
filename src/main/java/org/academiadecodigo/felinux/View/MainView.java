package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.GameObjects.drugs.Shroom;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.extras.Background;
import org.academiadecodigo.felinux.controller.PlayerKeyboard;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainView {

    public MainView(){
        startGame();
    }

    public void startGame(){
       // Music music = new Music("/sounds/Depressed_Somewhere_Over_the_Rainbow_OLD_WAV.mp3");
        //music.play(true);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        final Background background = new Background();
        final Dorothy dorothy = new Dorothy();
        PlayerKeyboard keyboard = new PlayerKeyboard(dorothy);

        //TODO criar classe for purgatory
        final Purgatory purgatory = new Purgatory();
        final HighnessMeter highnessMeter = new HighnessMeter();
        final Shroom shroom = new Shroom(purgatory);

        /**
         * Game Loop
         */
        executorService.execute(
            new Runnable() {
                @Override
                public void run() {

                    while (true) {

                        if (highnessMeter.getMeter() >= 195) {

                            //CRIAR VELHA
                        } else if(highnessMeter.getMeter() <= 65 ){

                            //CRIAR NOVA
                        } else{
                            //VELHA
                        }

                        background.setHighEffect();
                        purgatory.draw();
                        purgatory.animate();
                        //map.draw();
                        dorothy.move();
                        highnessMeter.animate();
                        shroom.spawnShroom();

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
