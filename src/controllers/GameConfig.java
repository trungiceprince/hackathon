package controllers;

/**
 * Created by Nghia on 10/23/2016.
 */
public class GameConfig {
    public static final int DEFAULT_BACKGROUND_WIDTH = 1000;
    public static final int DEFAULT_BACKGROUND_HEIGHT = 400;
    public static final int DEFAUL_DELAY = 17;
    public static final int GRAVITY_ACCELEBRATION = 5;

    private int threadDelayInMiliseconds;
    private int screenWidth;
    private int screenHeight;



    private GameConfig(int threadDelayInMiliseconds, int screenWidth, int screenHeight) {
        this.threadDelayInMiliseconds = threadDelayInMiliseconds;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }


    public int getBackgroundWidth(){
        return screenWidth;
    }
    public int getBackgroundHeight(){
        return screenHeight;
    }

    public int getThreadDelayInMiliseconds() {
        return threadDelayInMiliseconds;
    }

    public int getGravityAccelebration(){
        return GRAVITY_ACCELEBRATION;
    }



    public double getSeconds(int count) {
        return (threadDelayInMiliseconds * count) / 1000;
    }

    public double getMiliseconds(int count) {
        return threadDelayInMiliseconds * count;
    }

    public static GameConfig instance = new GameConfig(DEFAUL_DELAY,DEFAULT_BACKGROUND_WIDTH, DEFAULT_BACKGROUND_HEIGHT);
}
