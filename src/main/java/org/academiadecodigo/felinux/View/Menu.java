package org.academiadecodigo.felinux.View;

import org.academiadecodigo.felinux.Services.GameCycle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Menu implements KeyboardHandler {

    private Keyboard keyboard;
    private GameCycle gameCycle;
    private boolean startGame;
    private boolean exit;


    public void MenuHandler(GameCycle gameCycle) {
        this.keyboard = new Keyboard(this);
        this.gameCycle = gameCycle;
        this.startGame = false;
    }

    public void init() {
        KeyboardEvent sKey = new KeyboardEvent();
        sKey.setKey(KeyboardEvent.KEY_S);
        sKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(sKey);


        KeyboardEvent eKey = new KeyboardEvent();
        eKey.setKey(KeyboardEvent.KEY_E);
        eKey.setKey(KeyboardEvent.KEY_E);
        keyboard.addEventListener(eKey);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
            this.startGame = true;
        }


        if (keyboardEvent.getKey() == keyboardEvent.KEY_E) {
            this.exit = true;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }


}

