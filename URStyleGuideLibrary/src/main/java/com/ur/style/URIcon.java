package com.ur.style;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class URIcon {

	public ImageIcon warning_icon_small = createImageIcon("/iconset_e-series_1_1/general_icons/warning_icon_small.png");

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
