package com.ur.director;

import javax.swing.JToggleButton;

import com.ur.builder.IToggleBuilder;
import com.ur.builder.objects.BuilderLibrary;
import com.ur.builder.objects.LargeToggleBuilder;
import com.ur.builder.objects.SmallToggleBuilder;
import com.ur.style.URBorder;

public class ToggleDirector extends BuilderLibrary {

	private IToggleBuilder builderLarge = new LargeToggleBuilder();
	private IToggleBuilder builderSmall = new SmallToggleBuilder();

	public JToggleButton BuildLargeToggleButton(int width, boolean enabled) {

		builderLarge.setEnabled(enabled);
		builderLarge.setHeight(urBorder.HEIGHT_VERY_LARGE);
		builderLarge.setWidth(width);
		builderLarge.build();
		return builderLarge.getComponent();

	}

	public JToggleButton BuildSmallToggleButton(int width, boolean enabled) {

		builderSmall.setEnabled(enabled);
		builderSmall.setHeight(urBorder.HEIGHT_MEDIUM);
		builderSmall.setWidth(width);
		builderSmall.build();
		return builderSmall.getComponent();

	}

}
