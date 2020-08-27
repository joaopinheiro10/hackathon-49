package org.academiadecodigo.felinux.Services;

import org.academiadecodigo.felinux.GameObjects.map.MapType;
import org.academiadecodigo.felinux.GameObjects.map.Purgatory;
import org.academiadecodigo.felinux.GameObjects.map.Room;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.PurgatoryView;
import org.academiadecodigo.felinux.View.RoomView;
import org.academiadecodigo.felinux.View.View;
import org.academiadecodigo.felinux.View.extras.Background;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;
import org.academiadecodigo.felinux.controller.PlayerKeyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;

public class GameCycle {

    private Dorothy player;
    public static MapType activeMap = MapType.PURGATORY;
    public static Picture imageMap = new Picture(50,50, activeMap.getSource());
    private HighnessMeter hm;
    private LinkedList<View> mapList;

    public GameCycle() {
        this.mapList = new LinkedList<>();
        player = new Dorothy();
    }


    public void setupGame() {

        PlayerKeyboard keyboard = new PlayerKeyboard(player);
        hm = new HighnessMeter();;
        RoomView roomView = new RoomView();
        roomView.setPlayer(player);
        PurgatoryView purgatoryView = new PurgatoryView();
        purgatoryView.setPlayer(player);
        mapList.add(purgatoryView);
    }

    /**
     * While player is alive, game is looping
     */
    public void start() {

        mapList.get(0).init(hm);
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
