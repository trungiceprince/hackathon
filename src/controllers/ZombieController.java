package controllers;

import modules.GameModule;
import modules.Zombie;
import view.AnimationDrawer;
import view.GameDrawer;

import java.awt.*;

/**
 * Created by Admin on 10/24/2016.
 */
public class ZombieController extends SingleController implements Contactable{
    public static final int DEFAULT_LOCATION_X = GameConfig.instance.getBackgroundWidth() - Zombie.ZOMBIE_WIDTH;
    public static final int DEFAULT_LOCATION_Y = GameConfig.instance.getBackgroundHeight()*2/3;

    private int dx;
    private int dy;
    public static final int SPEED = 1;
    private int count = 0;

    private MoveBehavior moveBehavior;

    public ZombieController(GameModule gameModule, GameDrawer gameDrawer,MoveBehavior moveBehavior) {
        super(gameModule, gameDrawer);
        this.moveBehavior = moveBehavior;
        CollisionPool.instance.register(this);
    }

    public int getX(){
        return gameModule.getX();
    }
    public int getY(){
        return gameModule.getY();
    }

//    public ZombieController(GameView gameView){
//        super(new Zombie(DEFAULT_LOCATION_X,DEFAULT_LOCATION_Y),
//                gameView);
//    }


    @Override
    public void draw(Graphics graphics) {
        super.draw(graphics);
    }


    @Override
    public void run() {
//        super.run();
//        gameModule.move(SPEED,0);
//        this.moveBehavior.doMove(this.gameModule);
//        System.out.println("do move");
//        count++;
//        if(count > 700){
//            count = 0;
//            if(moveBehavior != null){
                this.moveBehavior.doMove(this.gameModule);
//            }
//        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void onCollide(Contactable contactable) {
        if(contactable instanceof BulletController){
            ((BulletController) contactable).destroy();
        }
    }
    public static ZombieController create(int x, int y,ZombieType type){
        String[] arrName = {"zombie_type_11.png","zombie_type_12.png","zombie_type_13.png",
                "zombie_type_14.png","zombie_type_15.png","zombie_type_16.png",
                "zombie_type_17.png","zombie_type_18.png","zombie_type_19.png",
                "zombie_type_110.png","zombie_type_111.png","zombie_type_112.png",
                "zombie_type_113.png","zombie_type_114.png","zombie_type_115.png",
                "zombie_type_116.png","zombie_type_117.png","zombie_type_118.png",
                "zombie_type_119.png","zombie_type_120.png","zombie_type_121.png",
                "zombie_type_122.png"};
        AnimationDrawer animationDrawer = null;
        MoveBehavior moveBehavior = null;
        if(type == ZombieType.ZOMBIE){
            animationDrawer = new AnimationDrawer(arrName);
            moveBehavior = new LeftBehavior();
//            moveBehavior = null;
        }


        return new ZombieController(
                new Zombie(x,y),
                animationDrawer,
                moveBehavior
        );
    }
}
