package com.ur.impl.builder.objects;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JSlider;
import javax.swing.border.Border;

import com.ur.impl.builder.ISliderBuilder;

public class SliderBuilder extends BuilderLibrary implements ISliderBuilder {
	private JSlider slider;
	private int width;
	private int min, max;
	
	private void buildComponent() {
		setBorder();
		setDimension();
		setColor();
		setSliderValue();
		setSetting();
	}
	
	private void setBorder() {
		Border border = BorderFactory.createLineBorder(urColorPalette.WHITE, urBorder.BORDER_THIN);
		slider.setBorder(border);
	}
	
	private void setColor() {
		slider.setBackground(urColorPalette.WHITE);
		slider.setForeground(urColorPalette.BLACK);
	}
	
	private void setDimension() {
		slider.setPreferredSize(new Dimension(width, urBorder.HEIGHT_TINY));
	}
	
	private void setSliderValue() {
		slider.setMinimum(min);
		slider.setMaximum(max);
	}
	
	private void setSetting() {
		slider.setFocusable(false);
		
        slider.setPaintTrack(true); 
        slider.setPaintTicks(true); 
        slider.setPaintLabels(true); 
        
        // set spacing/ the middle value.
        int tickSpacing = (min + max)/2;
        slider.setMajorTickSpacing(tickSpacing); 
	}
	
	@Override
	public void build() {
		this.slider = new JSlider();
		this.buildComponent();
	}

	@Override
	public void setSliderValue(int min, int max) {
		this.min = min;
		this.max = max;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public JSlider getComponent() {
		return slider;
	}

}
