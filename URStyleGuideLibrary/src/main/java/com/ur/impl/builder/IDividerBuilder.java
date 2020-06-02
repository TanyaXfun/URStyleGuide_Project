package com.ur.impl.builder;

import javax.swing.JSeparator;

public interface IDividerBuilder extends IBuilder {
	public void setWidth(int width);	
	public void setHorizontal(boolean horizontal);
	public JSeparator getComponent() ;
}
