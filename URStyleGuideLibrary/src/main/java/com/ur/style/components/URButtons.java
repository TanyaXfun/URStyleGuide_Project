package com.ur.style.components;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import com.ur.director.ButtonDirector;

/**
 * This class contains get methods for all of the possible UR button types. The method returns an instance of JButtons
 * where the looks and feel of the buttons are according to the UR Style Guide.
 * @author Bruger
 *
 */
public class URButtons {

	private ButtonDirector buttonDirector = new ButtonDirector();

	public URButtons() {
	}

	public JButton getSmallButtonEnabled(String buttonText, int width) {

		JButton myButton = buttonDirector.BuildButton(width, true, true);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);

		return myButton;

	}

	public JButton getSmallButtonDisabled(String buttonText, int width) {

		JButton myButton = buttonDirector.BuildButton(width, false, true);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);

		return myButton;

	}

	public JButton getSmallCTAButtonEnabled(String buttonText, int width) {

		JButton myButton = buttonDirector.BuildCTAButton(width, true, true);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);

		return myButton;

	}

	public JButton getSmallCTAButtonDisabled(String buttonText, int width) {

		JButton myButton = buttonDirector.BuildCTAButton(width, false, true);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);

		return myButton;

	}

	public JButton getMediumCTAButtonEnabled(String buttonText, int width) {

		JButton myButton = buttonDirector.BuildCTAButton(width, true, false);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);

		return myButton;

	}

	public JButton getMediumCTAButtonDisabled(String buttonText, int width) {

		JButton myButton = buttonDirector.BuildCTAButton(width, false, false);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);

		return myButton;

	}

	public JButton getLargeButtonEnabled(String buttonText, int width) {

		JButton myButton = buttonDirector.BuildButton(width, true, false);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);

		return myButton;

	}

	public JButton getLargeButtonDisabled(String buttonText, int width) {

		JButton myButton = buttonDirector.BuildButton(width, false, false);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);

		return myButton;

	}

}
