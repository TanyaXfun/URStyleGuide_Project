package com.ur.style.components;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import com.ur.director.MessageDirector;
import com.ur.ekstra.MessageType;
import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;

public class URWarningMessage {
	
	private JToggleButton togglebutton = new JToggleButton();
	private URBorder urBorder = new URBorder();
	private URColorPalette urColorPalette = new URColorPalette();
	private URLayout urLayout = new URLayout();
	private URTypegraphy typegraphy = new URTypegraphy();
	
	private MessageDirector messageDirector = new MessageDirector();
	
	public URWarningMessage() {
		// TODO Auto-generated constructor stub
	}
	
	
	public JLabel getLargeWarningMessage(String messageText, int width) {
		
		JLabel label = messageDirector.buildMessage(width, MessageType.WARNING, false);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);
		
//		JLabel label = new JLabel(messageText, SwingConstants.CENTER);
//		
//		Border border = BorderFactory.createLineBorder(urColorPalette.GOlD_YELLOW_2,urBorder.BORDER_THIN);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_MAIN_HEADING_SIZE);
//		
//		label.setBorder(border);
//		label.setFont(font);
//		
//		label.setPreferredSize(new Dimension(width, urBorder.HEIGHT_BIG));
//		label.setMaximumSize(label.getPreferredSize());
//		
//		label.setOpaque(true);
//		label.setBackground(urColorPalette.LIGHT_YELLOW);
//		
//		label.setForeground(urColorPalette.BLACK);
//		
		
		
		return label;
	}
	
	public JLabel getSmallWarningMessage(String messageText, int width) {
		
		JLabel label = messageDirector.buildMessage(width, MessageType.WARNING, true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText(messageText);
		
//		JLabel label = new JLabel(messageText, SwingConstants.CENTER);
//		
//		Border border = BorderFactory.createLineBorder(urColorPalette.GOlD_YELLOW_2,urBorder.BORDER_THIN);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Plain, typegraphy.FONT_VERY_LARGE);
//		
//		label.setBorder(border);
//		label.setFont(font);
//		
//		label.setPreferredSize(new Dimension(width, urBorder.HEIGHT_SMALL));
//		label.setMaximumSize(label.getPreferredSize());
//		
//		label.setOpaque(true);
//		label.setBackground(urColorPalette.LIGHT_YELLOW);
//		
//		label.setForeground(urColorPalette.BLACK);
		
		
		
		return label;
	}
}
