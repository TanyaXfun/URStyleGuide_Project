package com.ur.director;

import javax.swing.JLabel;

import com.ur.builder.IMessageBuilder;
import com.ur.builder.objects.BuilderLibrary;
import com.ur.builder.objects.MessageBuilder;
import com.ur.ekstra.MessageType;

public class MessageDirector extends BuilderLibrary {

	private IMessageBuilder messageBuilder = new MessageBuilder();

	public JLabel buildMessage(int width, MessageType type, boolean small) {

		if (small) {
			messageBuilder.setFontSize(urTypegraphy.FONT_VERY_LARGE);
			messageBuilder.setFontStyle(urTypegraphy.Plain);
			messageBuilder.setHeight(urBorder.HEIGHT_SMALL);
		} else {
			messageBuilder.setFontSize(urTypegraphy.FONT_MAIN_HEADING_SIZE);
			messageBuilder.setFontStyle(urTypegraphy.Bold);
			messageBuilder.setHeight(urBorder.HEIGHT_BIG);
		}

		messageBuilder.setWidth(width);
		messageBuilder.setMessageType(type);
		messageBuilder.build();

		return messageBuilder.getComponent();
	}
}
