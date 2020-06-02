package com.ur.impl.director;

import com.ur.impl.builder.IDividerBuilder;
import com.ur.impl.builder.objects.BuilderLibrary;
import com.ur.impl.builder.objects.DividerBuilder;

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
