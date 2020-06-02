package com.ur.impl.builder.objects;

import java.awt.Component;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import com.ur.impl.builder.ITablesBuilder;

public class TablesBuilder extends BuilderLibrary implements ITablesBuilder {

	private JTable table;

	private void buildComponent() {
		setFont();
		setColor();
		setSetting();
		setRows();
	}

	private void setFont() {
		Font font = new Font(urTypegraphy.FontFamilie_DejaVu, urTypegraphy.Plain, urTypegraphy.FONT_LARGE);
		table.setFont(font);
		table.setFont(font);
	}

	private void setColor() {
		table.setForeground(urColorPalette.BLACK);
	}

	private void setSetting() {
		table.setShowGrid(false);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
	}

	@SuppressWarnings("serial")
	private void setRows() {
		table.setRowHeight(urBorder.HEIGHT_VERY_SMALL);
		table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row,
						column);
				c.setBackground(row % 2 == 0 ? urColorPalette.LIGHT_GRAY_3 : urColorPalette.WHITE);
				return c;
			}
		});
	}

	@Override
	public void build() {
		this.table = new JTable();
		this.buildComponent();
	}

	@Override
	public JTable getComponent() {
		return table;
	}

}
