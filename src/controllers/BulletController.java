package controllers;

import modules.GameModule;
import view.GameView;

/**
 * Created by apple on 10/9/16.
 */
public class BulletController extends SingleController implements Contactable {

    public static final int SPEED = 10;

    public BulletController(GameModule gameModule, GameView gameView) {
        super(gameModule, gameView);
//        CollisionPool.instance.register(this);
    }

    @Override
    public void run() {
        gameModule.move(0, -SPEED);
    }

    @Override
    public void onCollide(Contactable contactable) {
        
    }
}
