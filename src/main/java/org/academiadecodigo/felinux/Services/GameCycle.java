package org.academiadecodigo.felinux.Services;

import org.academiadecodigo.felinux.GameObjects.map.MapType;
import org.academiadecodigo.felinux.GameObjects.map.Purgatory;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.PurgatoryView;
import org.academiadecodigo.felinux.View.extras.Background;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;
import org.academiadecodigo.felinux.controller.PlayerKeyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameCycle {

    private Dorothy player;
    public static MapType activeMap = MapType.PURGATORY;
    public static Picture imageMap = new Picture(50,50, activeMap.getSource());
    private PurgatoryView purgatoryView;
    private HighnessMeter highnessMeter;


    public GameCycle() {
        player = new Dorothy();
    }

    public void setupGame() {
        PlayerKeyboard keyboard = new PlayerKeyboard(player);
        Background background = new Background();
        highnessMeter = new HighnessMeter();
        purgatoryView = new PurgatoryView();
        purgatoryView.setPlayer(player);
        purgatoryView.setHighnessMeter(highnessMeter);
        purgatoryView.setBackground(background);
    }

    /**
     * While player is alive, game is looping
     */
    public void start() {


        purgatoryView.init();
        /*menu.init();

        instructions.show();

        roomView.init();
        if(!player.isAlive()) {

            // TODO View for losing
            System.out.println("Game Over");
            start();
        }

        hallView.init();*/

    }
}
