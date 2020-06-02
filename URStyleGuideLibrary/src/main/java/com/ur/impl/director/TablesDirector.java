package com.ur.impl.director;

import javax.swing.JTable;

import com.ur.impl.builder.ITablesBuilder;
import com.ur.impl.builder.objects.TablesBuilder;

public class TablesDirector {
	private ITablesBuilder builder = new TablesBuilder();

	public JTable buildTable() {
		builder.build();
		return builder.getComponent();
	}
}
