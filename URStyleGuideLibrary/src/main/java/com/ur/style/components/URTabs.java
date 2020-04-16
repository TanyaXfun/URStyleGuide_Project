package com.ur.style.components;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;

import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;

public class URTabs {

	private URBorder border = new URBorder();
	private URColorPalette urColorPalette = new URColorPalette();
	private URLayout urLayout = new URLayout();
	private URTypegraphy typegraphy = new URTypegraphy();

	public URTabs() {
		// TODO Auto-generated constructor stub
	}

	public JTabbedPane getTabbedPane(int layoutColumWidth) {

		JTabbedPane tabPane = new JTabbedPane();
		Border myBorder = BorderFactory.createMatteBorder(0, 0, border.BORDER_THIN, 0, urColorPalette.BLACK);
				//BorderFactory.createLineBorder(urColorPalette.BLACK);
		
		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
		Dimension dimension = new Dimension(layoutColumWidth, border.HEIGHT_MEDIUM);

		int columWidth = layoutColumWidth;

		if (!(columWidth > 0)) {

			columWidth = urLayout.installationColumWidth*2;
		}

		tabPane.setPreferredSize(dimension);
		tabPane.setBorder(myBorder);
		tabPane.setBackground(urColorPalette.UR_BLUE);
		tabPane.setForeground(urColorPalette.BLACK);
		tabPane.setFont(font);
		
		// TODO: Remove when release
		tabPane.addTab("Command", new JPanel());
		tabPane.addTab("Graphics", new JPanel());
		tabPane.addTab("Variables", new JPanel());

		return tabPane;

	}
	
	public void addTab(JTabbedPane tabbedPane, String myTabTitle, Component component) {
		
		tabbedPane.addTab("Command", new JPanel());
		tabbedPane.addTab("Graphics", new JPanel());
		tabbedPane.addTab("Variables", new JPanel());
		tabbedPane.addTab("", component);
		tabbedPane.addTab(myTabTitle, component);

	}
}
