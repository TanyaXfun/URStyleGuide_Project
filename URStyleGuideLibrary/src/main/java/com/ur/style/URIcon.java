package com.ur.style;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 * This class has the method "createImageIcon" creates an icon
 * based on the path. 
 * 
 */

public class URIcon {

	//Example on how to use the method to create an image icon.
	public ImageIcon warning_icon_small = createImageIcon("/iconset_e-series_1_1/general_icons/warning_icon_small.png");

	/**
	 * Creates an icon based on the path of the image.
	 * @param path of the image. Found in the package: src/main/resources.
	 * @return a image icon.
	 */
	private ImageIcon createImageIcon(String path) {
		ImageIcon icon = null;
		try {
			BufferedImage imgURL = ImageIO.read(getClass().getResourceAsStream(path));

			if (imgURL != null) {
				icon = new ImageIcon(imgURL);

			}
		} catch (IOException e) {
			System.out.println("NO IMAGE FOUND");
		}

		return icon;
	}

}
