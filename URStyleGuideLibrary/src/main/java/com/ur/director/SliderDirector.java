package com.ur.director;

import javax.swing.JSlider;

import com.ur.builder.ISliderBuilder;
import com.ur.builder.objects.BuilderLibrary;
import com.ur.builder.objects.SliderBuilder;

public class SliderDirector extends BuilderLibrary {

	private ISliderBuilder builder = new SliderBuilder();

	public JSlider buildSlider(int min, int max, int width) {
		builder.setSliderValue(min, max);
		builder.setWidth(width);
		builder.build();
		return builder.getComponent();
	}
}
