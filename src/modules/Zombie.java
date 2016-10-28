package modules;

/**
 * Created by Admin on 10/24/2016.
 */
public class Zombie extends GameModuleWithHP{
    public static final int ZOMBIE_WIDTH = 60;
    public static final int ZOMBIE_HEIGHT = 90;
    public boolean isAlive = true;

    public Zombie(int x, int y) {
        super(x,y,ZOMBIE_WIDTH,ZOMBIE_HEIGHT,1);
    }

}

