package com.ur.impl.director;

import javax.swing.JTabbedPane;

import com.ur.impl.builder.ITabsBuilder;
import com.ur.impl.builder.objects.TabsBuilder;

public class TabsDirector {
	private ITabsBuilder builder = new TabsBuilder();

	public JTabbedPane buildTabbedPane() {
		builder.build();
		return builder.getComponent();
	}
}
