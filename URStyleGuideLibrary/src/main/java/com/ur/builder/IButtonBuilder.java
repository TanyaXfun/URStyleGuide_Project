package com.ur.builder;

import javax.swing.JButton;

public interface IButtonBuilder extends IBuilder {
	public void setHeight(int height);
	public void setWidth(int width);	
	public void setEnabled(boolean enable);
	public JButton getComponent() ;
}
