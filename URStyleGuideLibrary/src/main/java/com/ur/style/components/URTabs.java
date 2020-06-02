package com.ur.style.components;

import javax.swing.JTabbedPane;

import com.ur.impl.director.TabsDirector;


/**
 * This class creates Tabs which returns a JTabbedPane.
 * The layout is according to UR-Style guide for e-series.
 *
 */
public class URTabs {

	private TabsDirector director = new TabsDirector();

	public URTabs() {
	}

	public JTabbedPane getTabbedPane(int width) {
		JTabbedPane tabbedPane = director.buildTabbedPane();
		return tabbedPane;

	}

}
