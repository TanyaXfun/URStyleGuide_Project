package com.ur.builder.objects;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTabbedPane;
import javax.swing.border.Border;

import com.ur.builder.ITabsBuilder;

public class TabsBuilder extends BuilderLibrary implements ITabsBuilder {
	private JTabbedPane tabbedPane;
	private int width;

	public void buildComponent() {
		setDimension();
		setFont();
		setBorder();
		setColor();
	}

	private void setDimension() {
		Dimension dimension = new Dimension(width, urBorder.HEIGHT_MEDIUM);
		tabbedPane.setPreferredSize(dimension);
		tabbedPane.setMaximumSize(tabbedPane.getMaximumSize());

	}

	private void setFont() {
		Font font = new Font(urTypegraphy.FontFamilie_DejaVu, urTypegraphy.Bold, urTypegraphy.FONT_VERY_LARGE);
		tabbedPane.setFont(font);
	}

	private void setBorder() {
		Border border = BorderFactory.createMatteBorder(0, 0, urBorder.BORDER_THIN, 0, urColorPalette.BLACK);
		tabbedPane.setBorder(border);

	}

	private void setColor() {
		tabbedPane.setBackground(urColorPalette.UR_BLUE);
		tabbedPane.setForeground(urColorPalette.BLACK);
	}

	@Override
	public void build() {
		this.tabbedPane = new JTabbedPane();
		this.buildComponent();
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public JTabbedPane getComponent() {
		return tabbedPane;
	}

}
