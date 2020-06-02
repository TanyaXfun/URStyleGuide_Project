package com.ur.style.components;

import javax.swing.JComboBox;

import com.ur.impl.director.DropdownDirector;

public class URDropdowns {

	private DropdownDirector director = new DropdownDirector();

	public URDropdowns() {
	}

	@SuppressWarnings("rawtypes")
	public JComboBox getDropDownEnabled(int width) {

		JComboBox comboBox = director.buildComboBox(true);

//		JComboBox comboBox = new JComboBox();
//		
//		Border border = BorderFactory.createLineBorder(urColorPalette.BLACK, urBorder.BORDER_THIN);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu,typegraphy.Plain ,typegraphy.FONT_VERY_LARGE);

//		comboBox.setBorder(border);
//		comboBox.setFont(font);
//		comboBox.setFocusable(false);
//		comboBox.setBackground(urColorPalette.WHITE);

//		comboBox.setPreferredSize(new Dimension(300, 30));
//		comboBox.setMaximumSize(comboBox.getPreferredSize());
//		comboBox.setEditable(false);

		return comboBox;

	}

	@SuppressWarnings("rawtypes")
	public JComboBox getDropDownDisabled(int width) {

		JComboBox comboBox = director.buildComboBox(false);

//		JComboBox comboBox = new JComboBox();
//		
//		Border border = BorderFactory.createLineBorder(urColorPalette.GRAY_5, urBorder.BORDER_THIN);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu,typegraphy.Plain ,typegraphy.FONT_VERY_LARGE);

//		comboBox.setBorder(border);
//		comboBox.setFont(font);
//		comboBox.setFocusable(false);
//		comboBox.setBackground(urColorPalette.WHITE);
//		comboBox.setEnabled(false);

//		comboBox.setPreferredSize(new Dimension(300, 30));
//		comboBox.setMaximumSize(comboBox.getPreferredSize());
//		comboBox.setEditable(false);

		return comboBox;

	}

}
