package modules;

/**
 * Created by Nghia on 10/23/2016.
 */
public class GameModule {
    private int x;
    private int y;
    final int witdh;
    final int height;
    private boolean isAlive;

    public GameModule(int x, int y, int witdh, int height) {
        this.x = x;
        this.y = y;
        this.witdh = witdh;
        this.height = height;
        isAlive = true;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWitdh() {
        return witdh;
    }

    public int getHeight() {
        return height;
    }
    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void move(double dx, double dy){
        x+=dx;
        y+=dy;
    }
}
