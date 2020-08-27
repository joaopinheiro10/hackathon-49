package org.academiadecodigo.felinux;

import org.academiadecodigo.felinux.Services.GameCycle;
import org.academiadecodigo.felinux.View.MainView;

public class LibTest {
    public static void main(String[] args) {
        //MainView mainView = new MainView();

        GameCycle gameCycle = new GameCycle();
        gameCycle.setupGame();
        gameCycle.start();
    }
}
