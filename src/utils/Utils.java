package utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

/**
 * Created by Nghia on 10/23/2016.
 */
public class Utils {
    public static BufferedImage loadImage(String url){
        BufferedImage returnImage = null;
        try {
            returnImage = ImageIO.read(new File(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnImage;
    }

    public static BufferedImage loadImageFromResources(String url){
        return loadImage("resources/"+url);
    }
    public static Vector<Image> loadSprite(String sheetName, int count, int offsetX, int offsetY, int width, int height) {
        Vector<Image> imageVector = new Vector<>();
        BufferedImage sheetImage = loadImageFromResources(sheetName);
        for (int i = 0; i < count; i++) {
            int x = i * width + (i + 1) * offsetX;
            int y = offsetY;
            Image image = sheetImage.getSubimage(x, y, width, height);
            imageVector.add(image);
        }
        return imageVector;
    }
}
