package com.ur.style.components;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.ur.impl.director.MessageDirector;
import com.ur.impl.ekstra.MessageType;

/**
 * This class creates a Error message which is an instance of JLabel in swing.
 * The layout is according to UR style guide for e-series.
 */

public class URErrorMessage {
	
	private MessageDirector messageDirector = new MessageDirector();
	
	public URErrorMessage() {
	}
	
	public JLabel getLargeErrorMessage(String messageText, int width) {
		
		JLabel label = messageDirector.buildMessage(width, MessageType.ERROR, false);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);
		
		return label;
	}
	
	public JLabel getSmallErrorMessage(String messageText, int width) {
		
		JLabel label = messageDirector.buildMessage(width, MessageType.ERROR, true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);
		
		return label;
	}
	
}
