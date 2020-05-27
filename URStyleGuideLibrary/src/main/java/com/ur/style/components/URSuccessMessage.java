package com.ur.style.components;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.ur.director.MessageDirector;
import com.ur.ekstra.MessageType;

public class URSuccessMessage {
	
	private MessageDirector messageDirector = new MessageDirector();
	
	public URSuccessMessage() {
	}
	
	public JLabel getLargeSuccessMessage(String messageText, int width) {
		
		JLabel label = messageDirector.buildMessage(width, MessageType.SUCCESS, false);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);
		
		return label;
	}
	
	public JLabel getSmallSuccessMessage(String messageText, int width) {
		
		JLabel label = messageDirector.buildMessage(width, MessageType.SUCCESS, true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);

		return label;
	}
}
