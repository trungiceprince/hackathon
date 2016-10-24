package controllers;

import modules.GameModule;
import modules.Zombie;
import view.GameView;

import java.awt.*;

/**
 * Created by Admin on 10/24/2016.
 */
public class ZombieController extends SingleController implements Contactable{
    public static final int DEFAULT_LOCATION_X = 0;
    public static final int DEFAULT_LOCATION_Y = GameConfig.instance.getBackgroundHeight()*3/4;

    private int dx;
    private int dy;
    public static final int SPEED = 1;

    public ZombieController(GameModule gameModule, GameView gameView) {
        super(gameModule, gameView);
    }

    public int getX(){
        return gameModule.getX();
    }
    public int getY(){
        return gameModule.getY();
    }

    public ZombieController(GameView gameView){
        super(new Zombie(DEFAULT_LOCATION_X,DEFAULT_LOCATION_Y),
                gameView);
    }

    @Override
    public void run() {
//        super.run();
        gameModule.move(SPEED,0);
    }

    @Override
    public void onCollide(Contactable contactable) {

    }
}
