package view;

import modules.GameModule;

import java.awt.*;

/**
 * Created by Nghia on 10/23/2016.
 */
public class GameView {
    Image image;

    public GameView(Image image) {
        this.image = image;
    }

    public void draw(GameModule gameModule, Graphics graphics){
        graphics.drawImage(image,gameModule.getX(),gameModule.getY(),
                    gameModule.getWidth(),gameModule.getHeight(),
                    null);
    }
}
