package com.ur.impl.builder.objects;

import java.awt.Dimension;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import com.ur.impl.builder.IDividerBuilder;

public class DividerBuilder extends BuilderLibrary implements IDividerBuilder {

	private int width;
	private JSeparator seperator;
	private boolean horizontal;

	private void buildComponent() {
		setDimension();
		setColor();
	}

	private void setDimension() {
		if (horizontal) {
			seperator.setOrientation(SwingConstants.HORIZONTAL);
		}else {
			seperator.setOrientation(SwingConstants.VERTICAL);
		}
		seperator.setPreferredSize(new Dimension(width, urBorder.BORDER_NORMAL));
	}

	private void setColor() {
		seperator.setBackground(urColorPalette.LIGHT_GRAY_2);
	}

	@Override
	public void build() {
		this.seperator = new JSeparator();
		this.buildComponent();
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	@Override
	public JSeparator getComponent() {
		return seperator;
	}

}
