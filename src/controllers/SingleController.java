package controllers;

import modules.GameModule;
import view.GameView;

import java.awt.*;

/**
 * Created by Nghia on 10/23/2016.
 */
public class SingleController {
    GameModule gameModule;
    GameView gameView;

    public SingleController(GameModule gameModule, GameView gameView) {
        this.gameModule = gameModule;
        this.gameView = gameView;
    }

    public GameModule getGameModule() {
        return gameModule;
    }

    public void run(){

    }

    public void draw(Graphics graphics){
        gameView.draw(gameModule,graphics);
    }


}
