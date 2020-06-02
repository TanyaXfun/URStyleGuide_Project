package com.ur.impl.builder;

import javax.swing.JLabel;

import com.ur.ekstra.MessageType;

public interface IMessageBuilder extends IBuilder{
	public void setHeight(int height);
	public void setWidth(int width);	
	public void setMessageType(MessageType type);
	public void setFontSize(int fontSize);
	public void setFontStyle(int fontStyle);
	public JLabel getComponent();
	
}
