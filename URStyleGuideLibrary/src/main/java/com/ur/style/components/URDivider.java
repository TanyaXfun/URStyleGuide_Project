package com.ur.style.components;

import java.awt.Dimension;

import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;

public class URDivider {
	private JToggleButton togglebutton = new JToggleButton();
	private URBorder urBorder = new URBorder();
	private URColorPalette urColorPalette = new URColorPalette();
	private URLayout urLayout = new URLayout();
	
	public URDivider() {
		// TODO Auto-generated constructor stub
	}
	
	
	public JSeparator getHorizontalDivider(int width) {
		
		JSeparator seperator = new JSeparator(SwingConstants.HORIZONTAL);
		
		seperator.setPreferredSize(new Dimension(width,urBorder.BORDER_NORMAL));
		seperator.setBackground(urColorPalette.LIGHT_GRAY_2);
		
		return seperator;
		
	}
	
	
	public JSeparator getVerticalDivider(int width) {
		
		JSeparator seperator = new JSeparator(SwingConstants.VERTICAL);
		
		
		seperator.setPreferredSize(new Dimension(width,urBorder.BORDER_NORMAL));
		seperator.setBackground(urColorPalette.LIGHT_GRAY_2);
		
		return seperator;
		
	}
	
}
