package com.ur.style.components;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.ur.impl.director.TextFieldDirector;
import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;

/**
 * This class creates text fields.
 * The layout is according to UR style guide for e-series.
 * @author thph
 * TODO: Implement builder pattern for this component.
 *
 */

public class URTextFields {
	
//	private URBorder urBorder = new URBorder();
//	private URColorPalette urColorPalette = new URColorPalette();
//	private URLayout urLayout = new URLayout();
//	private URTypegraphy typegraphy = new URTypegraphy();
	
	private TextFieldDirector director = new TextFieldDirector();
	
	public URTextFields() {
	}
	

	public JTextField getTextFieldEnabled(int width) {
		
		JTextField textField = director.BuildTextField(width, true);
		
		
//		Border border = BorderFactory.createLineBorder(urColorPalette.BLACK, urBorder.BORDER_THIN);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Plain, typegraphy.FONT_VERY_LARGE);
		
//		textField.setBorder(border);
//		textField.setFont(font);
//		textField.setHorizontalAlignment(JTextField.RIGHT);
		
//		if(!(width > 0)) {
//			textField.setPreferredSize(new Dimension(urLayout.installationColumWidth,urBorder.HEIGHT_SMALL));
//		}
		
//		textField.setFocusable(false);
//		textField.setPreferredSize(new Dimension(width,urBorder.HEIGHT_SMALL));
//		textField.setMaximumSize(textField.getPreferredSize());
//		textField.setForeground(urColorPalette.BLACK);
		
		
		return textField;
	}
	
	public JTextField getTextFieldDisabled(int width) {
		
		JTextField textField = director.BuildTextField(width, false);
		
//		Border border = BorderFactory.createLineBorder(urColorPalette.GRAY_5, urBorder.BORDER_THIN);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Plain, typegraphy.FONT_VERY_LARGE);
		
//		textField.setBorder(border);
//		textField.setFont(font);
//		textField.setHorizontalAlignment(JTextField.RIGHT);
//		
//		if(!(width > 0)) {
//			textField.setPreferredSize(new Dimension(urLayout.installationColumWidth,urBorder.HEIGHT_SMALL));
//		}
		
//		textField.setFocusable(false);
//		textField.setPreferredSize(new Dimension(width,urBorder.HEIGHT_SMALL));
//		textField.setMaximumSize(textField.getPreferredSize());
//		textField.setForeground(urColorPalette.GRAY_5);
//		textField.setEnabled(false);
		
		
		return textField;
	}
	
}
