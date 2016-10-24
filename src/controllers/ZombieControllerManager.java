package controllers;

import utils.Utils;
import view.GameView;

import java.util.Vector;

/**
 * Created by Admin on 10/24/2016.
 */
public class ZombieControllerManager extends ControllerManager{
    ZombieController zombieController;
    public static final int DELAY = 150;
    private int count = 150;
    public ZombieControllerManager(){
        super();
    }

    @Override
    public void run() {
        super.run();
        count ++;
        if (count >= 150){
            count = 0;
            zombieController = new ZombieController(new GameView(Utils.loadImageFromResources("zombieee.png")));
            baseControllers.add(zombieController);
        }
    }
}
