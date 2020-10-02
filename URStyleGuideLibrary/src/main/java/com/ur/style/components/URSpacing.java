package com.ur.style.components;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.Box;
import com.ur.style.URSpacingSize;
/**
 * This class provides the vertical and horizontal space component
 * between each UI component.
 * @author thph
 *
 */

public class URSpacing {
	
	private URSpacingSize style = new URSpacingSize();
	
	/**
	 * Creates a vertical space between component.
	 * @param height of the space component.
	 * @return
	 */
	public Component createVerticalSpacing(int height) {
		return Box.createRigidArea(new Dimension(0, height));
	}

	/**
	 * creates a horizontal space with the pre-defined
	 * space width from URSpacingSize class.
	 * @return
	 */
	public Component createHorizontalSpacing() {
		return Box.createRigidArea(new Dimension(style.HORIZONTAL_SPACING, 0));
	}
}
