package com.ur.builder.objects;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.border.Border;

import com.ur.builder.IDropdownBuilder;

public class DropdownBuilder extends BuilderLibrary implements IDropdownBuilder {

	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	private boolean enabled;
	private Border border;

	private void buildComponent() {
		setDimension();
		setBorder();
		setFont();
		setColor();
		setSetting();
	}

	private void setDimension() {
		comboBox.setPreferredSize(new Dimension(300, 30));
		comboBox.setMaximumSize(comboBox.getPreferredSize());
	}

	private void setColor() {
		comboBox.setBackground(urColorPalette.WHITE);
	}

	private void setBorder() {
		if (enabled) {
			border = BorderFactory.createLineBorder(urColorPalette.BLACK, urBorder.BORDER_THIN);
		} else {
			border = BorderFactory.createLineBorder(urColorPalette.GRAY_5, urBorder.BORDER_THIN);
		}
		comboBox.setBorder(border);
	}

	private void setFont() {
		Font font = new Font(urTypegraphy.FontFamilie_DejaVu, urTypegraphy.Plain, urTypegraphy.FONT_VERY_LARGE);
		comboBox.setFont(font);
	}

	private void setSetting() {
		if (!enabled) {
			comboBox.setEnabled(false);
		}
		comboBox.setEditable(false);
		comboBox.setFocusable(false);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void build() {
		this.comboBox = new JComboBox();
		this.buildComponent();
	}

	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public JComboBox getComponent() {
		return comboBox;
	}

}
