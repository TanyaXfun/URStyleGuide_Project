package com.ur.impl.builder.objects;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;

import com.ur.impl.builder.IButtonBuilder;

public class ButtonBuilder extends BuilderLibrary implements IButtonBuilder {
	
	private JButton button;
	private int width;
	private int height;
	private boolean enabled;

	private void buildComponent() {
		setDimension();
		setBorder();
		setColor();
		setFont();
	}

	private void setDimension() {
		button.setPreferredSize(new Dimension(this.width, this.height));
		button.setMaximumSize(button.getPreferredSize());
	}

	private void setColor() {
		
		button.setBackground(urColorPalette.WHITE);
		button.setForeground(urColorPalette.BLACK);
		if (enabled) {
			button.setForeground(urColorPalette.BLACK);
		} else {
			button.setForeground(urColorPalette.GRAY_5);
		}

	}

	private void setBorder() {
		if (enabled) {
			Border myButtonBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, urBorder.BORDER_NORMAL);
			button.setBorder(myButtonBorder);
		} else {
			Border myToggleBorder = BorderFactory.createLineBorder(urColorPalette.GRAY_5, urBorder.BORDER_NORMAL);
			button.setBorder(myToggleBorder);
		}
		
		button.setEnabled(enabled);
	}

	private void setFont() {
		Font font = new Font(urTypegraphy.FontFamilie_DejaVu, urTypegraphy.Bold, urTypegraphy.FONT_VERY_LARGE);
		button.setFont(font);
	}


	@Override
	public void build() {
		this.button = new JButton();
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
	public void setEnabled(boolean enable) {
		this.enabled = enable;		
	}

	@Override
	public JButton getComponent() {
		return button;
	}



}
