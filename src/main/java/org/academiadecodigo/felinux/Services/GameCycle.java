package org.academiadecodigo.felinux.Services;

import org.academiadecodigo.felinux.GameObjects.map.MapType;
import org.academiadecodigo.felinux.GameObjects.map.Purgatory;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.HallView;
import org.academiadecodigo.felinux.View.PurgatoryView;
import org.academiadecodigo.felinux.View.RoomView;
import org.academiadecodigo.felinux.View.View;
import org.academiadecodigo.felinux.View.extras.Background;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;
import org.academiadecodigo.felinux.controller.PlayerKeyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;
import java.util.List;

public class GameCycle {

    private Dorothy player;
    public static MapType activeMap = MapType.PURGATORY;
    public static Picture imageMap = new Picture(50,50, activeMap.getSource());
    private List<View> mapList = new LinkedList<>();
    private PurgatoryView purgatoryView;
    private HighnessMeter highnessMeter;


    public GameCycle() {
    }

    public void setupGame() {
        Background background = new Background();
        highnessMeter = new HighnessMeter();
        purgatoryView = new PurgatoryView();
        player = new Dorothy();
        PlayerKeyboard keyboard = new PlayerKeyboard(player);
        purgatoryView.setPlayer(player);
    }

    /**
     * While player is alive, game is looping
     */
    public void start() {

        purgatoryView.init(highnessMeter);
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

    /**
     * Setup for room view
     */
    public void setupRoomView() {
        RoomView roomView = new RoomView();
        roomView.setPlayer(player);
        mapList.add(roomView);
    }

    /**
     * Setup for hall view
     */
    public void setupHallView() {
        HallView hallView = new HallView();
        hallView.setPlayer(player);
        mapList.add(hallView);
    }
}
