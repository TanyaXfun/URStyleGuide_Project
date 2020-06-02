package com.ur.impl.builder;

import javax.swing.JSlider;

public interface ISliderBuilder extends IBuilder{
	public void setSliderValue(int min, int max);
	public void setWidth(int width);
	public JSlider getComponent();
}
