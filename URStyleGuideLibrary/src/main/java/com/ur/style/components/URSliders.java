package com.ur.style.components;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JSlider;
import com.ur.builder.objects.BuilderLibrary;
import com.ur.director.SliderDirector;

public class URSliders extends BuilderLibrary {
	private SliderDirector director = new SliderDirector();

	public URSliders() {

	}

	/**
	 * Methods for slider. It is not completely aligned with the GUIDE concerning
	 * the label for showing the numbers.
	 * 
	 * @param min
	 * @param max
	 * @param width
	 * @return JSlider component
	 */
	public JSlider getSlider(int min, int max, int width) {
		JSlider slider = director.buildSlider(min, max, width);

		return slider;
	}

	/**
	 * Method for creating a label for the slider.
	 * 
	 * @param labelText
	 * @return
	 */
	public JLabel getSliderLabel(String labelText) {

		JLabel label = new JLabel();
		Font font = new Font(urTypegraphy.FontFamilie_DejaVu, urTypegraphy.Plain, urTypegraphy.FONT_VERY_LARGE);
		label.setForeground(urColorPalette.BLACK);

		if (labelText.equals("") || labelText.equals(null)) {
			label.setText("Slider");
		}

		label.setFont(font);

		return label;

	}

}
