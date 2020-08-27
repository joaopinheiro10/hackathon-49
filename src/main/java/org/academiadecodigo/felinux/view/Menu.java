package org.academiadecodigo.felinux.view;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import static org.academiadecodigo.felinux.tools.DirectionType.LEFT;
import static org.academiadecodigo.felinux.tools.DirectionType.RIGHT;

public class Menu implements KeyboardHandler {

    private Keyboard keyboard;
    private org.academiadecodigo.felinux.view.Game game;
    private boolean startGame;
    private boolean showInstructions;


    public void MenuHandler(org.academiadecodigo.felinux.view.Game game) {
        this.keyboard = new Keyboard(this);
        this.game = game;
        this.startGame = false;
    }

    public void init() {
        KeyboardEvent sKey = new KeyboardEvent();
        sKey.setKey(KeyboardEvent.KEY_S);
        sKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(sKey);

        KeyboardEvent iKey = new KeyboardEvent();
        iKey.setKey(KeyboardEvent.KEY_I);
        iKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(iKey);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_S) {
            this.startGame = true;
        }

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_I) {
            this.showInstructions = true;

        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }


}

