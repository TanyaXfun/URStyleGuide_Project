package com.ur.style.components;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.ur.ekstra.MessageType;
import com.ur.impl.director.MessageDirector;

public class URWarningMessage {

	private MessageDirector messageDirector = new MessageDirector();

	public URWarningMessage() {
	}

	public JLabel getLargeWarningMessage(String messageText, int width) {

		JLabel label = messageDirector.buildMessage(width, MessageType.WARNING, false);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);

		return label;
	}

	public JLabel getSmallWarningMessage(String messageText, int width) {

		JLabel label = messageDirector.buildMessage(width, MessageType.WARNING, true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);

		return label;
	}
}
