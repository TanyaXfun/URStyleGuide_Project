package com.ur.style.components;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.border.Border;

import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;

public class URSliders {
	private URBorder border = new URBorder();
	private URColorPalette urColorPalette = new URColorPalette();
	private URLayout urLayout = new URLayout();
	private URTypegraphy typegraphy = new URTypegraphy();

	public URSliders() {
		
	}

	//TODO: not completely aligned with the GUIDE concerning the label for showing the numbers.

	public JSlider getSlider(int min, int max, int width) {
		final JSlider slider = new JSlider();
		
		//Border myBorder = BorderFactory.createLineBorder(urColorPalette.GRAY_5, border.BORDER_INT);
		
		slider.setBackground(urColorPalette.WHITE);
		//slider.setBorder(myBorder);
		slider.setMinimum(min);
		slider.setMaximum(max);
		slider.setFocusable(false);
		//slider.setForeground(urColorPalette.UR_BLUE);
		
        slider.setPaintTrack(true); 
        slider.setPaintTicks(true); 
        slider.setPaintLabels(true); 
        
        // set spacing 
        int tickSpacing = (min + max)/2;
        slider.setMajorTickSpacing(tickSpacing); 
        //slider.setMinorTickSpacing(5); 
		
		if(!(width > 0)) {
			slider.setPreferredSize(new Dimension(urLayout.installationColumWidth*2, border.HEIGHT_TINY));
		}

		slider.setPreferredSize(new Dimension(width, border.HEIGHT_TINY));
		//slider.setMaximumSize(slider.getPreferredSize());

		return slider;
	}

	//can be used if you want to be aligned with the UR guide 100%
	public JLabel getSliderLabel(String labelText) {

		JLabel label = new JLabel();
		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Plain, typegraphy.FONT_VERY_LARGE);
		label.setForeground(urColorPalette.BLACK);

		if (labelText.equals("") || labelText.equals(null)) {
			label.setText("Slider");
		}
		
		label.setFont(font);

		return label;

	}

}
