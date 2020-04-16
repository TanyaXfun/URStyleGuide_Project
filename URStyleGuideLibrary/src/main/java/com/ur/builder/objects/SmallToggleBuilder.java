package com.ur.builder.objects;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

import com.ur.builder.IToggleBuilder;

public class SmallToggleBuilder extends BuilderLibrary implements IToggleBuilder {
	private JToggleButton smallToggle;
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
		smallToggle.setPreferredSize(new Dimension(this.width, this.height));
		smallToggle.setMaximumSize(smallToggle.getPreferredSize());
	}

	private void setColor() {
		
		smallToggle.setForeground(urColorPalette.BLACK);
		if (enabled) {
			smallToggle.setBackground(urColorPalette.LIGHT_BLUE);
		} else {
			smallToggle.setBackground(urColorPalette.WHITE);
		}

	}

	private void setBorder() {
		if (enabled) {
			Border myToggleBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, urBorder.BORDER_NORMAL);
			smallToggle.setBorder(myToggleBorder);
		} else {
			Border myToggleBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, urBorder.BORDER_NORMAL);
			smallToggle.setBorder(myToggleBorder);
		}
	}

	private void setFont() {
		Font font = new Font(urTypegraphy.FontFamilie_DejaVu, urTypegraphy.Bold, urTypegraphy.FONT_VERY_LARGE);
		smallToggle.setFont(font);
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
	public JToggleButton getComponent() {
		// TODO Auto-generated method stub
		return smallToggle;
	}

	@Override
	public void build() {
		this.smallToggle = new JToggleButton();
		this.buildComponent();
	}

	@Override
	public void Change(JComponent component) {
		smallToggle = (JToggleButton) component;
		this.buildComponent();
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
		
	}

}
