package org.academiadecodigo.felinux;

import org.academiadecodigo.felinux.Services.GameCycle;

public class Main {

    public static void main(String[] args) {
        GameCycle game = new GameCycle();
        game.setupGame();
        game.start();
    }
}
