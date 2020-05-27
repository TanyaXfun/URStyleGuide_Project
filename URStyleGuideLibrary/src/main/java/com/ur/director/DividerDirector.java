package com.ur.director;

import com.ur.builder.IDividerBuilder;
import com.ur.builder.objects.BuilderLibrary;
import com.ur.builder.objects.DividerBuilder;

import javax.swing.JSeparator;

public class DividerDirector extends BuilderLibrary {

	private IDividerBuilder builder = new DividerBuilder();

	public JSeparator buildDivider(int width, boolean horizontal) {
		builder.setWidth(width);
		builder.setHorizontal(horizontal);
		builder.build();
		return builder.getComponent();
	}
}
