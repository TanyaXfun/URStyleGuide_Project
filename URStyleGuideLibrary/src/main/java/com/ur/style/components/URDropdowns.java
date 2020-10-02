package com.ur.style.components;

import javax.swing.JComboBox;
import com.ur.impl.director.DropdownDirector;

/**
 * This class creates a dropdown which is a JComboBox in Swing.
 * The layout of the dropdown is according to UR style guide for e-series.
 * @author thph
 *
 */

public class URDropdowns {

	private DropdownDirector director = new DropdownDirector();

	public URDropdowns() {
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getDropDownEnabled(int width) {

		JComboBox comboBox = director.buildComboBox(true);

		return comboBox;

	}

	@SuppressWarnings("rawtypes")
	public JComboBox getDropDownDisabled(int width) {

		JComboBox comboBox = director.buildComboBox(false);

		return comboBox;

	}

}
