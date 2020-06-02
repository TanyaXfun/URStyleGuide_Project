package com.ur.impl.builder.objects;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

import com.ur.impl.builder.ILoadingBarBuilder;
import com.ur.impl.ekstra.RoundCornerBorder;

public class LoadingBarBuilder extends BuilderLibrary implements ILoadingBarBuilder {

	private JProgressBar loadingBar;
	private int width;
	private int height;
	private boolean thin;

	private void buildComponent() {
		setDimension();
		setBorder();
		setColor();
		setFont();
	}

	private void setDimension() {
		loadingBar.setPreferredSize(new Dimension(this.width, this.height));
		loadingBar.setMaximumSize(loadingBar.getPreferredSize());
	}

	private void setColor() {
		loadingBar.setForeground(urColorPalette.UR_BLUE);
		loadingBar.setBackground(urColorPalette.WHITE);
	}

	private void setBorder() {
		Border border = BorderFactory.createEmptyBorder(urBorder.BORDER_THIN, urBorder.BORDER_THIN,
				urBorder.BORDER_THIN, urBorder.BORDER_THIN);
		loadingBar.setBorder(border);
		loadingBar.setBorder(new RoundCornerBorder());
	}

	private void setFont() {
		if (thin) {
			Font font = new Font(urTypegraphy.FontFamilie_DejaVu, urTypegraphy.Plain, urTypegraphy.FONT_SMALL);
			loadingBar.setFont(font);
		}

	}

	@Override
	public void build() {
		this.loadingBar = new JProgressBar();
		this.buildComponent();
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public JProgressBar getComponent() {
		return this.loadingBar;
	}

	@Override
	public void setThin(boolean thin) {
		this.thin = thin;
	}

}
