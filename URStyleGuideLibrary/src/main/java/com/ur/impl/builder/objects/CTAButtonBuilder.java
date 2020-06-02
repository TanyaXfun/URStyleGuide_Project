package com.ur.impl.builder.objects;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

import com.ur.impl.builder.IButtonBuilder;

public class CTAButtonBuilder extends BuilderLibrary implements IButtonBuilder {
	
	private JButton button;
	private int width;
	private int height;
	private boolean enabled;

	private void buildComponent() {
		setDimension();
		setColor();
		setFont();
	}

	private void setDimension() {
		button.setPreferredSize(new Dimension(this.width, this.height));
		button.setMaximumSize(button.getPreferredSize());
	}

	private void setColor() {
		
		
		if (enabled) {
			button.setBackground(urColorPalette.UR_BLUE);
			button.setForeground(urColorPalette.BLACK);
		} else {
			button.setBackground(urColorPalette.GRAY_5);
			button.setForeground(urColorPalette.GRAY_3);
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
