package utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
}
