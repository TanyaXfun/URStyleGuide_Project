package com.ur.style.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import com.ur.builder.IButtonBuilder;
import com.ur.builder.objects.ButtonBuilder;
import com.ur.director.ButtonDirector;
import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;

public class URButtons {
	
	private URBorder border = new URBorder();
	private URColorPalette urColorPalette = new URColorPalette();
	private URLayout urLayout = new URLayout();
	private URTypegraphy typegraphy = new URTypegraphy();
	
	private ButtonDirector buttonDirector = new ButtonDirector();

	public URButtons() {
		// TODO Auto-generated constructor stub
	}
	
	
	public JButton getSmallButtonEnabled(String buttonText, int width) {
		
		JButton myButton = buttonDirector.BuildButton(width, true, true);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
//		JButton myButton = new JButton(buttonText);
//		Border myBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, border.BORDER_NORMAL);
//		
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(width, border.HEIGHT_MEDIUM);
//		int columWidth = width;
//
//		if (buttonText.equals(null) || buttonText.equals(""))
//
//		{
//			myButton.setText("Cancel");
//			
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setButtonLayout(myButton, dimension, myBorder, font, urColorPalette.WHITE, urColorPalette.BLACK);
		
		
		return myButton;
		
	}
	
	// TODO: Add an option for ICON setting.
	public JButton getSmallButtonEnabledIcon(String buttonText, int width, Icon icon) {
		
		JButton myButton = new JButton(buttonText);
		Border myBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, border.BORDER_NORMAL);
		
		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
		Dimension dimension = new Dimension(width, border.HEIGHT_MEDIUM);
		int columWidth = width;

		if (buttonText.equals(null) || buttonText.equals(""))

		{
			myButton.setText("Cancel");
			
		} else if (!(columWidth > 0)) {

			columWidth = urLayout.installationColumWidth;
		}
		
		setButtonLayout(myButton, dimension, myBorder, font, urColorPalette.WHITE, urColorPalette.BLACK);
		myButton.setIcon(icon);
		
		
		return myButton;
		
	}
	
	public JButton getSmallButtonDisabled(String buttonText, int width) {
		
		JButton myButton = buttonDirector.BuildButton(width, false, true);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
//		JButton myButton = new JButton(buttonText);
//		Border myBorder = BorderFactory.createLineBorder(urColorPalette.GRAY_5, border.BORDER_NORMAL);
//		
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(width, border.HEIGHT_MEDIUM);
//		int columWidth = width;
//
//		if (buttonText.equals(null) || buttonText.equals(""))
//
//		{
//			myButton.setText("Cancel");
//			
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setButtonLayout(myButton, dimension, myBorder, font, urColorPalette.WHITE, urColorPalette.GRAY_5);
		
		
		return myButton;
		
	}
	
	// TODO: Add an option for ICON setting.
	public JButton getSmallButtonDisabledIcon(String buttonText, int width, Icon icon) {
		
		JButton myButton = new JButton(buttonText);
		Border myBorder = BorderFactory.createLineBorder(urColorPalette.GRAY_5, border.BORDER_NORMAL);
		
		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
		Dimension dimension = new Dimension(width, border.HEIGHT_MEDIUM);
		int columWidth = width;

		if (buttonText.equals(null) || buttonText.equals(""))

		{
			myButton.setText("Cancel");
			
		} else if (!(columWidth > 0)) {

			columWidth = urLayout.installationColumWidth;
		}
		
		setButtonLayout(myButton, dimension, myBorder, font, urColorPalette.WHITE, urColorPalette.GRAY_5);
		myButton.setIcon(icon);
		
		return myButton;
		
	}
	
	
	//_______________________________________________________SMALL CTA BUTTON____________________________________________________________________//
	
	
	public JButton getSmallCTAButtonEnabled(String buttonText, int width) {
		
		JButton myButton = buttonDirector.BuildCTAButton(width, true, true);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
//		JButton myButton = new JButton(buttonText);
//
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(width, border.HEIGHT_MEDIUM);
//		int columWidth = width;
//
//		if (buttonText.equals(null) || buttonText.equals(""))
//
//		{
//			myButton.setText("Clear Log Entries");
//			
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setButtonLayoutNoBorder(myButton, dimension, font, urColorPalette.UR_BLUE, urColorPalette.BLACK);
		
		
		return myButton;
		
	}
	
	public JButton getSmallCTAButtonDisabled(String buttonText, int width) {
		
		JButton myButton = buttonDirector.BuildCTAButton(width, false, true);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
				
		
//		JButton myButton = new JButton(buttonText);
//		
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(width, border.HEIGHT_MEDIUM);
//		int columWidth = width;
//
//		if (buttonText.equals(null) || buttonText.equals(""))
//
//		{
//			myButton.setText("Apply");
//			
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setButtonLayoutNoBorder(myButton, dimension, font, urColorPalette.GRAY_5, urColorPalette.GRAY_3);
//		myButton.setEnabled(false);
		
		
		return myButton;
		
	}
	
	//_______________________________________________________MEDIUM CTA BUTTON____________________________________________________________________//
	
	
	public JButton getMediumCTAButtonEnabled(String buttonText, int width) {
		
		JButton myButton = buttonDirector.BuildCTAButton(width, true, false);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
//		JButton myButton = new JButton(buttonText);
//
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(width, border.HEIGHT_LARGE);
//		int columWidth = width;
//
//		if (buttonText.equals(null) || buttonText.equals(""))
//
//		{
//			myButton.setText("Set Waypoint");
//			
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setButtonLayoutNoBorder(myButton, dimension, font, urColorPalette.UR_BLUE, urColorPalette.BLACK);
		
		
		return myButton;
		
	}
	
	
	public JButton getMediumCTAButtonDisabled(String buttonText, int width) {
		
		JButton myButton = buttonDirector.BuildCTAButton(width, false, false);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
//		JButton myButton = new JButton(buttonText);
//		
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(width, border.HEIGHT_LARGE);
//		int columWidth = width;
//
//		if (buttonText.equals(null) || buttonText.equals(""))
//
//		{
//			myButton.setText("Set Waypoint");
//			
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setButtonLayoutNoBorder(myButton, dimension, font, urColorPalette.GRAY_5, urColorPalette.GRAY_3);
//		myButton.setEnabled(false);
		
		
		return myButton;
		
	}
	
	//______________________________________________________LARGE BUTTON____________________________________________________________________//
	
	public JButton getLargeButtonEnabled(String buttonText, int width) {
		
		JButton myButton = buttonDirector.BuildButton(width, true, false);
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
//		JButton myButton = new JButton(buttonText);
//		Border myBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, border.BORDER_NORMAL);
//		
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(width, border.HEIGHT_HUGE);
//		int columWidth = width;
//
//		if (buttonText.equals(null) || buttonText.equals(""))
//
//		{
//			myButton.setText("Line");
//			
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setButtonLayout(myButton, dimension, myBorder, font, urColorPalette.WHITE, urColorPalette.BLACK);
		
		
		return myButton;
		
	}
	
	public JButton getLargeButtonDisabled(String buttonText, int width) {
		
		JButton myButton = buttonDirector.BuildButton(width, false, false);	
		myButton.setText(buttonText);
		myButton.setHorizontalTextPosition(SwingConstants.CENTER);
		
//		JButton myButton = new JButton(buttonText);
//		Border myBorder = BorderFactory.createLineBorder(urColorPalette.GRAY_5, border.BORDER_NORMAL);
//		
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(width, border.HEIGHT_HUGE);
//		int columWidth = width;
//
//		if (buttonText.equals(null) || buttonText.equals(""))
//
//		{
//			myButton.setText("Line");
//			
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setButtonLayout(myButton, dimension, myBorder, font, urColorPalette.WHITE, urColorPalette.GRAY_5);
		
		
		return myButton;
		
	}
	
	
	private void setButtonLayoutNoBorder(JButton button, Dimension dimension, Font font, Color backgroundColor, Color foregroundColor ) {
		
		button.setPreferredSize(dimension);
		button.setMaximumSize(button.getPreferredSize());
		button.setFont(font);
		button.setForeground(foregroundColor);
		button.setBackground(backgroundColor);
		button.setFocusable(false);
	}
	
	private void setButtonLayout(JButton button, Dimension dimension, Border border, Font font, Color backgroundColor, Color foregroundColor ) {
		
		button.setPreferredSize(dimension);
		button.setMaximumSize(button.getPreferredSize());
		button.setBorder(border);
		button.setFont(font);
		button.setForeground(foregroundColor);
		button.setBackground(backgroundColor);
		button.setFocusable(false);
	}
	
}
