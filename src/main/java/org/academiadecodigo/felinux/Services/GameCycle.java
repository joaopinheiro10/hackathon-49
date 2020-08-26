package org.academiadecodigo.felinux.Services;

import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.controller.PlayerController;

public class GameCycle {

    private Dorothy player;

    public GameCycle() {
    }

    /**
     * While player is alive, game is looping
     */
    public void start() {
        while(player.isAlive()){
            try {
                Thread.sleep(50);

                player.move();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
