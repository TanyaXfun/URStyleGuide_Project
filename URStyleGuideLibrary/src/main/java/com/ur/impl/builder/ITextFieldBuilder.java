package com.ur.impl.builder;

import javax.swing.JTextField;


public interface ITextFieldBuilder extends IBuilder{
	public void setWidth(int width);	
	public void setEnabled(boolean enable);
	public JTextField getComponent();
}
