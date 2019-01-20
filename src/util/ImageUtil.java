package util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageUtil {

	static public Image getImage(String imagePath) {
		URL url = ImageUtil.class.getClassLoader().getResource(imagePath);
		BufferedImage image = null;
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

	static public class Player {
		public static final int size = 2;
		public static Image bullet = getImage("img/player/bullet.png");
		public static Image gun = getImage("img/player/gun.png");
	}
}
