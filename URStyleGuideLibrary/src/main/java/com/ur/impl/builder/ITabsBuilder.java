package com.ur.impl.builder;

import javax.swing.JTabbedPane;

public interface ITabsBuilder extends IBuilder {
	public void setWidth(int width);
	public JTabbedPane getComponent();
}
