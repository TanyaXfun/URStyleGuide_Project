package com.ur.style.components;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableCellRenderer;

import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;

public class URTables {
	
	public URTables() {
		// TODO Auto-generated constructor stub
	}
	
	private JToggleButton togglebutton = new JToggleButton();
	private URBorder urBorder = new URBorder();
	private URColorPalette urColorPalette = new URColorPalette();
	private URLayout urLayout = new URLayout();
	private URTypegraphy typegraphy = new URTypegraphy();
	
	public JTable getTable() {
		JTable table = new JTable();
		
		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Plain, typegraphy.FONT_LARGE);
		
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("test1");
//        model.addRow(new String[]{"2018-02-06- 09:09:52.057 PolyScope        URSoftware 5.0.0"});
//        model.addRow(new String[]{"2018-02-06- 09:09:52.057 PolyScope        Connected to Controller"});
//        model.addRow(new String[]{"2018-02-06- 09:09:52.057 PolyScope        URSoftware 5.0.0 (26.10.2017)"});
//        model.addRow(new String[]{"2018-02-06- 09:09:52.057 PolyScope        URSoftware 5.0.0 (26.10.2017)"});
//        model.addRow(new String[]{"2018-02-06- 09:09:52.057 PolyScope        Safety checksum changed to: CCCC"});
//        JTable table = new JTable(model);
//		
		//JTable table = new JTable(data, columnNames);

		table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
					boolean hasFocus, int row, int column) {
				final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row,
						column);
				c.setBackground(row % 2 == 0 ? urColorPalette.LIGHT_GRAY_3: urColorPalette.WHITE);
				return c;
			}
		});

		//JScrollPane scrollPane = new JScrollPane(table);
		//scrollPane.setPreferredSize(new Dimension(width,urBorder.HEIGHT_VERY_SMALL));
//		scrollPane.getColumnHeader().setVisible(false);

		table.setFont(font);
		table.setForeground(urColorPalette.BLACK);
		table.setRowHeight(urBorder.HEIGHT_VERY_SMALL);
		table.setShowGrid(false);
		table.setShowHorizontalLines(false);
		table.setShowVerticalLines(false);
//		table.setPreferredSize(new Dimension(width, urBorder.HEIGHT_VERY_SMALL*table.getRowCount()));	
//		table.setMaximumSize(table.getPreferredSize());
		
		

		return table;

	}
}
