package org.academiadecodigo.felinux.Services;

import org.academiadecodigo.felinux.GameObjects.map.Hall;
import org.academiadecodigo.felinux.GameObjects.map.MapType;
import org.academiadecodigo.felinux.GameObjects.map.Purgatory;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;

import org.academiadecodigo.felinux.View.Menu;
import org.academiadecodigo.felinux.View.PurgatoryView;

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
    private Menu menu;

    public GameCycle() {
    }

    public void setupGame() {
        highnessMeter = new HighnessMeter();
        player = new Dorothy();
        menu = new Menu();
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
<<<<<<< HEAD

        menu.init();

        while (!menu.isStartGame()) {
            menu.startScreen();
        }

        menu.showInstructions();
=======
        /*
        menu.startScreen();
        menu.showInstructions();

*/
>>>>>>> 3e7fb277d56db62c0498da6f2f2ff38e6758228b


        mapList.get(0).init(highnessMeter, MapType.ROOM);


        mapList.get(1).init(highnessMeter, MapType.HALL);

        mapList.get(2).init(highnessMeter, activeMap);

        mapList.get(3).init(highnessMeter, activeMap);

        //Missing final scene


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
