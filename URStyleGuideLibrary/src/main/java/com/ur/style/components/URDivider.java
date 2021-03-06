package com.ur.style.components;

import javax.swing.JSeparator;

import com.ur.impl.director.DividerDirector;

/**
 * This class contains the two types of divider; Horizontal and Vertical. The
 * looks and feels of the dividers are according to the UR Style Guide for e-series.
 * 
 * @author thph
 *
 */
public class URDivider {

	private DividerDirector director = new DividerDirector();

	public URDivider() {
	}

	public JSeparator getHorizontalDivider(int width) {

		JSeparator separator = director.buildDivider(width, true);
		return separator;

	}

	public JSeparator getVerticalDivider(int width) {

		JSeparator separator = director.buildDivider(width, false);
		return separator;

	}

}
