package com.ur.impl.director;

import javax.swing.JComboBox;

import com.ur.impl.builder.IDropdownBuilder;
import com.ur.impl.builder.objects.BuilderLibrary;
import com.ur.impl.builder.objects.DropdownBuilder;

public class DropdownDirector extends BuilderLibrary{
	IDropdownBuilder builder = new DropdownBuilder();
	
	@SuppressWarnings("rawtypes")
	public JComboBox buildComboBox(boolean enabled) {
		builder.setEnabled(enabled);
		builder.build();
		return builder.getComponent();
	}
	
}
