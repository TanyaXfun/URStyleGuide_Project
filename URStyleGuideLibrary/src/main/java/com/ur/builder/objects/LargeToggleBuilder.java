package com.ur.builder.objects;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

import com.ur.builder.IToggleBuilder;

public class LargeToggleBuilder extends BuilderLibrary implements IToggleBuilder {

	private JToggleButton largeToggle;
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
		largeToggle.setPreferredSize(new Dimension(this.width, this.height));
		largeToggle.setMaximumSize(largeToggle.getPreferredSize());
	}

	private void setColor() {

		largeToggle.setBackground(urColorPalette.WHITE);
		if (enabled) {
			largeToggle.setForeground(urColorPalette.BLACK);
		} else {
			largeToggle.setForeground(urColorPalette.GRAY_5);
		}

	}

	private void setBorder() {
		if (enabled) {
			Border myToggleBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, urBorder.BORDER_NORMAL);
			largeToggle.setBorder(myToggleBorder);
		} else {
			Border myToggleBorder = BorderFactory.createLineBorder(urColorPalette.GRAY_5, urBorder.BORDER_NORMAL);
			largeToggle.setBorder(myToggleBorder);
		}
		largeToggle.setEnabled(enabled);
	}

	private void setFont() {
		Font font = new Font(urTypegraphy.FontFamilie_DejaVu, urTypegraphy.Bold, urTypegraphy.FONT_VERY_LARGE);
		largeToggle.setFont(font);
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
		return largeToggle;
	}

	@Override
	public void build() {
		this.largeToggle = new JToggleButton();
		this.buildComponent();
	}

	@Override
	public void Change(JComponent component) {
		largeToggle = (JToggleButton) component;
		this.buildComponent();
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
		
	}

}
