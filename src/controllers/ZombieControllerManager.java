package controllers;

import utils.Utils;
import view.GameView;

import java.util.Vector;

/**
 * Created by Admin on 10/24/2016.
 */
public class ZombieControllerManager extends ControllerManager{
    ZombieController zombieController;
    public static final int DELAY = 250;
    private int count = 250;
    private int countStop = 0;
    public ZombieControllerManager(){
        super();
        count ++;
//        System.out.println(count);
        if (count >= DELAY && countStop < 5){

            count = 0;
            countStop++;
            zombieController = ZombieController.create(ZombieController.DEFAULT_LOCATION_X,
                    ZombieController.DEFAULT_LOCATION_Y,
                    ZombieType.ZOMBIE);
//            System.out.println("do create");
//            zombieController = new ZombieController(new GameView(Utils.loadImageFromResources("zombieee.png")));
        }
        baseControllers.add(zombieController);
//        System.out.println("do add");
    }

//    @Override
//    public void run() {
//        super.run();
//        count ++;
////        System.out.println(count);
//        if (count >= DELAY && countStop < 5){
//
//            count = 0;
//            countStop++;
//            zombieController = ZombieController.create(ZombieController.DEFAULT_LOCATION_X,
//                    ZombieController.DEFAULT_LOCATION_Y,
//                    ZombieType.ZOMBIE);
////            System.out.println("do create");
////            zombieController = new ZombieController(new GameView(Utils.loadImageFromResources("zombieee.png")));
//        }
//        baseControllers.add(zombieController);
////        System.out.println("do add");
//    }
}
