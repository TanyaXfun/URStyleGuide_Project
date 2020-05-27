package com.ur.style.components;

import javax.swing.JTable;

import com.ur.director.TablesDirector;

public class URTables {

	private TablesDirector director = new TablesDirector();

	public URTables() {
	}

	public JTable getTable() {
		JTable table = director.buildTable();

//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Plain, typegraphy.FONT_LARGE);

//		table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
//			@Override
//			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
//					boolean hasFocus, int row, int column) {
//				final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row,
//						column);
//				c.setBackground(row % 2 == 0 ? urColorPalette.LIGHT_GRAY_3 : urColorPalette.WHITE);
//				return c;
//			}
//		});

//		table.setFont(font);
//		table.setForeground(urColorPalette.BLACK);
//		table.setRowHeight(urBorder.HEIGHT_VERY_SMALL);
//		table.setShowGrid(false);
//		table.setShowHorizontalLines(false);
//		table.setShowVerticalLines(false);

		return table;

	}
}
