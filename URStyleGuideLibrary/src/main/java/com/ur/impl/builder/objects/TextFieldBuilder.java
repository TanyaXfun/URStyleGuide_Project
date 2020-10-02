package com.ur.impl.builder.objects;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.ur.impl.builder.ITextFieldBuilder;

public class TextFieldBuilder extends BuilderLibrary implements ITextFieldBuilder {

	private JTextField textfield;
	private int width;
	private boolean enable;

	private void buildComponent() {
		setDimension();
		setBorder();
		setColor();
		setFont();
		setSetting();
	}

	private void setDimension() {
		textfield.setPreferredSize(new Dimension(width,urBorder.HEIGHT_SMALL));
		textfield.setMaximumSize(textfield.getPreferredSize());
	}

	private void setColor() {	
		if (enable) {
			textfield.setForeground(urColorPalette.BLACK);
		} else {
			textfield.setForeground(urColorPalette.GRAY_5);
		}
	}

	private void setBorder() {

		if (enable) {
			Border border = BorderFactory.createLineBorder(urColorPalette.BLACK, urBorder.BORDER_THIN);
			textfield.setBorder(border);
		} else {
			Border border = BorderFactory.createLineBorder(urColorPalette.GRAY_5, urBorder.BORDER_THIN);
			textfield.setBorder(border);
		}

		textfield.setEnabled(enable);
	}

	private void setFont() {
		Font font = new Font(urTypegraphy.FontFamilie_DejaVu, urTypegraphy.Plain, urTypegraphy.FONT_VERY_LARGE);
		textfield.setFont(font);
	}
	
	
	private void setSetting() {
		textfield.setHorizontalAlignment(JTextField.RIGHT);
		textfield.setFocusable(false);
	}

	@Override
	public void build() {
		textfield = new JTextField();
		this.buildComponent();

	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public JTextField getComponent() {
		return textfield;
	}

	@Override
	public void setEnabled(boolean enable) {
		this.enable = enable;
	}

}
