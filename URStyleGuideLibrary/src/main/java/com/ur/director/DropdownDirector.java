package com.ur.director;

import javax.swing.JComboBox;

import com.ur.builder.IDropdownBuilder;
import com.ur.builder.objects.BuilderLibrary;
import com.ur.builder.objects.DropdownBuilder;

public class DropdownDirector extends BuilderLibrary{
	IDropdownBuilder builder = new DropdownBuilder();
	
	@SuppressWarnings("rawtypes")
	public JComboBox buildComboBox(boolean enabled) {
		builder.setEnabled(enabled);
		builder.build();
		return builder.getComponent();
	}
	
}
