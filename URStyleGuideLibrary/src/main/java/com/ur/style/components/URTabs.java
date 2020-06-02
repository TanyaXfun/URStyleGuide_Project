package com.ur.style.components;

import javax.swing.JTabbedPane;

import com.ur.impl.director.TabsDirector;

public class URTabs {

	private TabsDirector director = new TabsDirector();

	public URTabs() {
	}

	public JTabbedPane getTabbedPane(int width) {

		JTabbedPane tabbedPane = director.buildTabbedPane();

//		Border myBorder = BorderFactory.createMatteBorder(0, 0, border.BORDER_THIN, 0, urColorPalette.BLACK);

//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Bold, typegraphy.FONT_VERY_LARGE);
//		Dimension dimension = new Dimension(width, border.HEIGHT_MEDIUM);

//		int columWidth = width;
//
//		if (!(columWidth > 0)) {
//
//			columWidth = urLayout.installationColumWidth*2;
//		}

//		tabPane.setPreferredSize(dimension);
//		tabPane.setMaximumSize(tabPane.getMaximumSize());
//		tabPane.setBorder(myBorder);
//		tabPane.setBackground(urColorPalette.UR_BLUE);
//		tabPane.setForeground(urColorPalette.BLACK);
//		tabPane.setFont(font);

		return tabbedPane;

	}

}
