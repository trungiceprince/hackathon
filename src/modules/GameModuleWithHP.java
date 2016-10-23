package modules;

/**
 * Created by Nghia on 10/23/2016.
 */
public class GameModuleWithHP extends GameModule {
    private int hp;

    public GameModuleWithHP(int x, int y, int width, int height, int hp) {
        super(x, y, width, height);
        this.hp = hp;
    }

    public void decreaseHP(int amount) {
        hp -= amount;
        if(hp <= 0) {
            isAlive = false;
        }
    }

    public void increaseHP(int amount) {
        hp += amount;
    }
}
