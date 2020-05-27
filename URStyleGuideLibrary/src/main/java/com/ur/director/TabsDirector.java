package com.ur.director;

import javax.swing.JTabbedPane;

import com.ur.builder.ITabsBuilder;
import com.ur.builder.objects.TabsBuilder;

public class TabsDirector {
	private ITabsBuilder builder = new TabsBuilder();

	public JTabbedPane buildTabbedPane() {
		builder.build();
		return builder.getComponent();
	}
}
