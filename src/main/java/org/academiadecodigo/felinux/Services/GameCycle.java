package org.academiadecodigo.felinux.Services;

import org.academiadecodigo.felinux.GameObjects.map.Hall;
import org.academiadecodigo.felinux.GameObjects.map.MapType;
import org.academiadecodigo.felinux.GameObjects.map.Purgatory;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.View.*;
import org.academiadecodigo.felinux.View.extras.Background;
import org.academiadecodigo.felinux.View.extras.HighnessMeter;
import org.academiadecodigo.felinux.controller.PlayerKeyboard;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;
import java.util.List;

public class GameCycle {

    private Dorothy player;
    public static MapType activeMap = MapType.ROOM;
    public static Picture imageMap = new Picture(50,50, activeMap.getSource());
    private List<View> mapList = new LinkedList<>();
    private HighnessMeter highnessMeter;


    public GameCycle() {
    }

    public void setupGame() {
        Background background = new Background();
        highnessMeter = new HighnessMeter();
        player = new Dorothy();
        PlayerKeyboard keyboard = new PlayerKeyboard(player);

        setupRoomView();
        setupHallView();
        setupAtriumView();
        setupPurgatoryView();
    }


    /**
     * While player is alive, game is looping
     */
    public void start() {

        mapList.get(0).init(highnessMeter, activeMap);

        mapList.get(1).init(highnessMeter, activeMap);
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

    /**
     * Setup for atrium view
     */
    public void setupAtriumView() {
        AtriumView atriumView = new AtriumView();
        atriumView.setPlayer(player);
        mapList.add(atriumView);
    }

    /**
     * Setup for purgatory view
     */
    public void setupPurgatoryView() {
        PurgatoryView purgatoryView = new PurgatoryView();
        purgatoryView.setPlayer(player);
        mapList.add(purgatoryView);
    }
}
