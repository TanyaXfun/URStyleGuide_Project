package com.ur.builder.objects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

import com.ur.builder.IMessageBuilder;
import com.ur.ekstra.MessageType;

public class MessageBuilder extends BuilderLibrary implements IMessageBuilder{
	
	private JLabel label;
	private int width;
	private int height;
	private int fontSize;
	private int fontStyle;
	private MessageType messagetype;
	
	private void buildComponent() {
		setDimension();
		setBorder();
		setColor();
		setFont();
	}

	private void setDimension() {
		label.setPreferredSize(new Dimension(this.width, this.height));
		label.setMaximumSize(label.getPreferredSize());
	}

	private void setColor() {
		
		label.setForeground(urColorPalette.BLACK);
		
		switch(messagetype) {
		case INFORMATIVE:
			label.setBackground(urColorPalette.LIGHT_BLUE);
			break;
		case SUCCESS:
			label.setBackground(urColorPalette.LIGHT_GREEN);
			break;
		case ERROR:
			label.setBackground(urColorPalette.LIGHT_RED);
			break;
		case WARNING:
			label.setBackground(urColorPalette.LIGHT_YELLOW);
			break;
		
		}

	}

	private void setBorder() {
		
		Color color = urColorPalette.WHITE;
		
		switch(messagetype) {
		
		case INFORMATIVE:
			color = urColorPalette.UR_BLUE;
			break;
			
		case SUCCESS:
			color = urColorPalette.BRIGHT_GREEN;
			break;
			
		case ERROR:
			color = urColorPalette.GRAY_RED;
			break;
			
		case WARNING:
			color = urColorPalette.GOlD_YELLOW_2;
			break;
		}
		
		Border border = BorderFactory.createLineBorder(color,urBorder.BORDER_THIN);
		
		label.setBorder(border);
		label.setOpaque(true);

	}

	private void setFont() {
		Font font = new Font(urTypegraphy.FontFamilie_DejaVu, this.fontStyle, this.fontSize);
		label.setFont(font);
	}

	@Override
	public void build() {
		this.label = new JLabel();
		this.buildComponent();
		
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
		
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
		
	}

	@Override
	public void setMessageType(MessageType type) {
		this.messagetype = type;
		
	}

	@Override
	public JLabel getComponent() {
		return this.label;
	}

	@Override
	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
		
	}

	@Override
	public void setFontStyle(int fontStyle) {
		this.fontStyle = fontStyle;
		
	}

}
