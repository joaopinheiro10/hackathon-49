package org.academiadecodigo.felinux;

import org.academiadecodigo.felinux.Services.GameCycle;
import org.academiadecodigo.felinux.sound.PlaySound;

public class Main {

    public static void main(String[] args) {
        PlaySound sound = new PlaySound();
        GameCycle game = new GameCycle();
        game.setupGame();
        game.start();
    }
}
