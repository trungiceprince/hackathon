package controllers;

import modules.GameModule;
import modules.Player;
import view.GameView;

import java.awt.event.KeyEvent;

/**
 * Created by Nghia on 10/23/2016.
 */
public class PlayerController extends SingleController implements Contactable{
    public static final int JUMP_HEIGHT = 50;
    public static final int DEFAULT_LOCATION_X = GameConfig.instance.getBackgroundWidth()/2-Player.WIDTH/2;
    public static final int DEFAULT_LOCATION_Y = GameConfig.instance.getBackgroundHeight() *9/10-Player.HEIGHT;
    public static final double DEFAULT_JUMP_VELOCITY = 3;
    public static final int DEFAULT_JUMP_TIME_IN_MILISECONDS = 17*20;
    public static final int DEFAULT_JUMP_DELAY = 17;

    private int count=0;
    private int jumpCount=-1;
    private double dx=0;
    private double dy=0;
    private double jumpVelocity = DEFAULT_JUMP_VELOCITY;
    public PlayerController(Player gameModule, GameView gameView) {
        super(gameModule, gameView);
    }

    public PlayerController(GameView gameView) {
        super(new Player(DEFAULT_LOCATION_X,DEFAULT_LOCATION_Y), gameView);
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
                break;
            case KeyEvent.VK_LEFT:
                break;
            case KeyEvent.VK_UP:
                break;
            case KeyEvent.VK_DOWN:
                break;
            case KeyEvent.VK_SPACE:
                if (jumpCount==-1)
                    jump();
                break;
        }
    }
    public void keyReleased(KeyEvent e) {

        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT:
            case KeyEvent.VK_LEFT:
                dx = 0;
                break;
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
                dy = 0;
                break;

        }
    }

    public void jump(){
        jumpCount=0;
    }

    public void jumpRun(){
        if (jumpCount==0){
            dy=-jumpVelocity;
        }

        if (GameConfig.instance.getMiliseconds(jumpCount)==DEFAULT_JUMP_TIME_IN_MILISECONDS){
            dy=0;
        }

        if (GameConfig.instance.getMiliseconds(jumpCount) == DEFAULT_JUMP_TIME_IN_MILISECONDS+ DEFAULT_JUMP_DELAY){
            dy=+jumpVelocity;
        }
        if (GameConfig.instance.getMiliseconds(jumpCount)==DEFAULT_JUMP_TIME_IN_MILISECONDS *2+ DEFAULT_JUMP_DELAY){
            dy=0;
            jumpCount=-1;
        }
        if(jumpCount>=0 ){
            jumpCount++;

        }
    }

    @Override
    public void run() {
//        count++;
        jumpRun();
        gameModule.move(dx,dy);
    }

    @Override
    public void onCollide(Contactable contactable) {

    }
}
