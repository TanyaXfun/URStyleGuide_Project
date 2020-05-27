package com.ur.style.components;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.ur.director.MessageDirector;
import com.ur.ekstra.MessageType;

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
