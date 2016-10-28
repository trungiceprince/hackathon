package view;

import modules.GameModule;

import java.awt.*;

/**
 * Created by Nghia on 10/23/2016.
 */
public class GameView extends GameDrawer{
    Image image;

    public GameView(Image image) {
        this.image = image;
    }

//    public void draw(GameModule gameModule, Graphics graphics){
//        graphics.drawImage(image,gameModule.getX(),gameModule.getY(),
//                    gameModule.getWidth(),gameModule.getHeight(),
//                    null);
//    }


    @Override
    public void drawImage(GameModule gameModule, Graphics g) {
        g.drawImage(
                image,
                gameModule.getX(),
                gameModule.getY(),
                gameModule.getWidth(),
                gameModule.getHeight(),
                null);
    }
}
