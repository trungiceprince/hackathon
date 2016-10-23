package modules;

/**
 * Created by Nghia on 10/23/2016.
 */
public class GameModule {
    int x;
    int y;
    final int witdh;
    final int height;

    public GameModule(int x, int y, int witdh, int height) {
        this.x = x;
        this.y = y;
        this.witdh = witdh;
        this.height = height;
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



    public void move(double dx, double dy){
        x+=dx;
        y+=dy;
    }
}
