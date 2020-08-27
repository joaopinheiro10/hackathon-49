package org.academiadecodigo.felinux.Services;

import javassist.Translator;
import org.academiadecodigo.felinux.GameObjects.model.Dorothy;
import org.academiadecodigo.felinux.map.MapType;
import org.academiadecodigo.felinux.view.Menu;

public class GameCycle {

    public static MapType activeMap;
    private Dorothy player;
    private Menu menu;



    public GameCycle() {
    }

    /**
     * While player is alive, game is looping
     */
    public void start() {

        menu.start();
            }

        }
}
