package com.ur.builder;

import javax.swing.JToggleButton;

public interface IToggleBuilder extends IBuilder, IChange {
	public void setHeight(int height);
	public void setWidth(int width);	
	public void setEnabled(boolean enable);
	public JToggleButton getComponent() ;
}

