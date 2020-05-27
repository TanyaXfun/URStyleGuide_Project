package com.ur.style.components;

import com.ur.director.ToggleDirector;
import javax.swing.*;

public class URToggles {

	private ToggleDirector director = new ToggleDirector();

	public URToggles() {
	}

	public JToggleButton getLargeToggleEnabled(String toggleText, int layoutColumWidth) {

		JToggleButton largeToggleEnabled = director.BuildLargeToggleButton(layoutColumWidth, true);
		largeToggleEnabled.setText(toggleText);

		return largeToggleEnabled;
	}

	public JToggleButton getLargeToggleDisabled(String toggleText, int layoutColumWidth) {

		JToggleButton largeToggleDisabled = director.BuildLargeToggleButton(layoutColumWidth, false);
		largeToggleDisabled.setText(toggleText);

		return largeToggleDisabled;
	}

	public JToggleButton getSmallToggleSelected(int layoutColumWidth) {
		JToggleButton smallToggleSelected = director.BuildSmallToggleButton(layoutColumWidth, true);

		return smallToggleSelected;
	}

	public JToggleButton getSmallToggleDeselected(int layoutColumWidth) {

		JToggleButton smallToggleDeselected = director.BuildSmallToggleButton(layoutColumWidth, false);

		return smallToggleDeselected;
	}

}
