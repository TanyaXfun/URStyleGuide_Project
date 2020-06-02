package com.ur.style.components;

import javax.swing.JTable;
import com.ur.impl.director.TablesDirector;

/**
 * This class creates a table which returns an instance of JTable.
 * The layout is according to UR style guide for e-series.
 *
 */

public class URTables {

	private TablesDirector director = new TablesDirector();

	public URTables() {
	}

	public JTable getTable() {
		JTable table = director.buildTable();
		return table;

	}
}
