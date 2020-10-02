package com.ur.style.components;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.ur.impl.director.MessageDirector;
import com.ur.impl.ekstra.MessageType;


/**
 * This class creates a information message which is an instance of JLabel in swing.
 * The layout is according to UR style guide for e-series.
 * @author thph
 *
 */

public class URInformativeMessage {
	
	private MessageDirector messageDirector = new MessageDirector();
	
	public URInformativeMessage() {
	}
	
	public JLabel getLargeInformativeMessage(String messageText, int width) {
		
		JLabel label = messageDirector.buildMessage(width, MessageType.INFORMATIVE, false);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);
		
		return label;
	}
	
	public JLabel getSmallInformativeMessage(String messageText, int width) {
		
		JLabel label = messageDirector.buildMessage(width, MessageType.INFORMATIVE, true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);

		return label;
	}
}
