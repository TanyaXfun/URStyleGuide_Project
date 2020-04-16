package com.ur.style.components;

import com.ur.director.ToggleDirector;
import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class URToggles {

	private URBorder border = new URBorder();
	private URColorPalette urColorPalette = new URColorPalette();
	private URLayout urLayout = new URLayout();
	private URTypegraphy typegraphy = new URTypegraphy();
	private ToggleDirector director = new ToggleDirector();

	public URToggles() {
	}

	public JToggleButton getLargeToggleEnabled(String toggleText, int layoutColumWidth) {
//		JToggleButton largeToggleEnabled = new JToggleButton(toggleText);
//
//		Border myToggleBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, border.BORDER_NORMAL);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(layoutColumWidth, border.HEIGHT_VERY_LARGE);
//		int columWidth = layoutColumWidth;
//
//		if (toggleText.equals(null) || toggleText.equals(""))
//
//		{
//			largeToggleEnabled.setText("Enable");
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setToggleLayout(largeToggleEnabled, dimension, myToggleBorder, font, urColorPalette.WHITE, urColorPalette.BLACK);
		
		JToggleButton largeToggleEnabled = director.BuildLargeToggleButton(layoutColumWidth, true);
		largeToggleEnabled.setText(toggleText);
		return largeToggleEnabled;
	}

	public JToggleButton getLargeToggleDisabled(String toggleText, int layoutColumWidth) {

//		JToggleButton largeToggleDisabled = new JToggleButton(toggleText);
//		Border myToggleBorder = BorderFactory.createLineBorder(urColorPalette.GRAY_5, border.BORDER_NORMAL);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(layoutColumWidth, border.HEIGHT_VERY_LARGE);
//		int columWidth = layoutColumWidth;
//
//		if (toggleText.equals(null) || toggleText.equals(""))
//
//		{
//			largeToggleDisabled.setText("Disable");
//		} else if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setToggleLayout(largeToggleDisabled, dimension, myToggleBorder, font, urColorPalette.WHITE, urColorPalette.GRAY_5);

		JToggleButton largeToggleDisabled = director.BuildLargeToggleButton(layoutColumWidth, false);
		largeToggleDisabled.setText(toggleText);
		return largeToggleDisabled;
	}
	
	// May add an option for ICON setting.
	public JToggleButton getSmallToggleSelected(int layoutColumWidth) {
//
//		JToggleButton smallToggleSelected = new JToggleButton();
//		Border myToggleBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, border.BORDER_NORMAL);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(layoutColumWidth, border.HEIGHT_MEDIUM);
//		int columWidth = layoutColumWidth;
//
//		if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setToggleLayout(smallToggleSelected, dimension, myToggleBorder, font, urColorPalette.LIGHT_BLUE, urColorPalette.BLACK);
		
		JToggleButton smallToggleSelected = director.BuildSmallToggleButton(layoutColumWidth, true);
		return smallToggleSelected;
	}
	
	// May add an option for ICON setting.
	public JToggleButton getSmallToggleDeselected(int layoutColumWidth) {

//		JToggleButton smallToggleDeselected = new JToggleButton();
//		Border myToggleBorder = BorderFactory.createLineBorder(urColorPalette.UR_BLUE, border.BORDER_NORMAL);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(layoutColumWidth, border.HEIGHT_MEDIUM);
//		int columWidth = layoutColumWidth;
//
//		if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth;
//		}
//		
//		setToggleLayout(smallToggleDeselected, dimension, myToggleBorder, font, urColorPalette.WHITE, urColorPalette.BLACK);

		JToggleButton smallToggleDeselected = director.BuildSmallToggleButton(layoutColumWidth, false);
		return smallToggleDeselected;
	}

	
//	private void setToggleLayout(JToggleButton toggle, Dimension dimension, Border border, Font font, Color backgroundColor, Color foregroundColor ) {
//		
//		toggle.setPreferredSize(dimension);
//		toggle.setMaximumSize(toggle.getPreferredSize());
//		toggle.setBorder(border);
//		toggle.setFont(font);
//		toggle.setForeground(foregroundColor);
//		toggle.setBackground(backgroundColor);
//		toggle.setFocusable(false);
//	}
//	
	



}
