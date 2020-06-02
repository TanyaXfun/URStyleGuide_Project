package com.ur.impl.builder;

import javax.swing.JProgressBar;

public interface ILoadingBarBuilder extends IBuilder {
	public void setHeight(int height);
	public void setWidth(int width);	
	public void setThin(boolean thin);
	public JProgressBar getComponent();
}
