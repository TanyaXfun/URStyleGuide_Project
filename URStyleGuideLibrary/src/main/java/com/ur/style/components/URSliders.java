package com.ur.style.components;

import javax.swing.JSlider;

import com.ur.impl.builder.objects.BuilderLibrary;
import com.ur.impl.director.SliderDirector;

/**
 * This class creates a slider and returns an instance of JSlider in Swing.
 * The layout is acccording to UR Style guide for e-series.
 * @author ur
 *
 */

public class URSliders extends BuilderLibrary {
	private SliderDirector director = new SliderDirector();

	/**
	 * Methods for slider. It is not completely aligned with the GUIDE concerning
	 * the label for showing the numbers but it can be used.
	 * 
	 * @param min value of the slider.
	 * @param max value of the slider.
	 * @param width for the layout of the slider.
	 * @return JSlider component
	 */
	public JSlider getSlider(int min, int max, int width) {
		JSlider slider = director.buildSlider(min, max, width);
		return slider;
	}

}
