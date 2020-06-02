package com.ur.impl.builder;

import javax.swing.JComboBox;

public interface IDropdownBuilder extends IBuilder {
	public void setEnabled(boolean enabled);
	@SuppressWarnings("rawtypes")
	public JComboBox getComponent() ;
}
