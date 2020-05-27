package com.ur.director;

import javax.swing.JTable;

import com.ur.builder.ITablesBuilder;
import com.ur.builder.objects.TablesBuilder;

public class TablesDirector {
	private ITablesBuilder builder = new TablesBuilder();

	public JTable buildTable() {
		builder.build();
		return builder.getComponent();
	}
}
