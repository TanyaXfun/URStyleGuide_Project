package com.ur.style.components;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.border.Border;

import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;

public class URDropdowns {
	private JToggleButton togglebutton = new JToggleButton();
	private URBorder urBorder = new URBorder();
	private URColorPalette urColorPalette = new URColorPalette();
	private URLayout urLayout = new URLayout();
	private URTypegraphy typegraphy = new URTypegraphy();
	

	public URDropdowns() {
		// TODO Auto-generated constructor stub
	}
	
	private JComboBox getDropDownEnabled(int width) {

		JComboBox comboBox = new JComboBox();
		
		Border border = BorderFactory.createLineBorder(urColorPalette.BLACK, urBorder.BORDER_THIN);
		Font font = new Font(typegraphy.FontFamilie_DejaVu,typegraphy.Plain ,typegraphy.FONT_VERY_LARGE);
		
		comboBox.setBorder(border);
		comboBox.setFont(font);
		comboBox.setFocusable(false);
		comboBox.setBackground(urColorPalette.WHITE);
		
		
		comboBox.setPreferredSize(new Dimension(300, 30));
		comboBox.setMaximumSize(comboBox.getPreferredSize());
		comboBox.setEditable(false);

		//comboBox.setModel(new DefaultComboBoxModel<Integer>(values));
	
		return comboBox;

	}
	
	private JComboBox getDropDownDisabled(int width) {

		JComboBox comboBox = new JComboBox();
		
		Border border = BorderFactory.createLineBorder(urColorPalette.GRAY_5, urBorder.BORDER_THIN);
		Font font = new Font(typegraphy.FontFamilie_DejaVu,typegraphy.Plain ,typegraphy.FONT_VERY_LARGE);
		
		
		comboBox.setBorder(border);
		comboBox.setFont(font);
		comboBox.setFocusable(false);
		comboBox.setBackground(urColorPalette.WHITE);
		comboBox.setEnabled(false);

		
		
		comboBox.setPreferredSize(new Dimension(300, 30));
		comboBox.setMaximumSize(comboBox.getPreferredSize());
		comboBox.setEditable(false);

		return comboBox;

	}

}
