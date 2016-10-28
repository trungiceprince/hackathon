package controllers;

import modules.GameModule;

/**
 * Created by Admin on 10/28/2016.
 */
public class LeftBehavior implements MoveBehavior{
    private double speed = 10;
    private int countMove = 0;
//    public LeftBehavior(double speed){
//        this.speed = speed;
//    }
    @Override
    public void doMove(GameModule gameModule) {
        countMove ++;
//        System.out.print("doMove");
        if(countMove >= 50){
            countMove = 0;
//            System.out.println("move--------------------------------------");
            gameModule.move(-speed,0);
        }
    }
}
