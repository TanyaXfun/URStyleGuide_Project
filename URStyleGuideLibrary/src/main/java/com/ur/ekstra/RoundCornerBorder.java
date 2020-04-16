package com.ur.ekstra;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;

import javax.swing.border.AbstractBorder;

import com.ur.style.URColorPalette;

public class RoundCornerBorder extends AbstractBorder {
	private URColorPalette urColorPalette = new URColorPalette();

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
		Graphics2D g2 = (Graphics2D) g.create();
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		int r = height;
		RoundRectangle2D round = new RoundRectangle2D.Float(x + 1, y + 2, width - 2, height - 4, r, r);

		g2.setColor(urColorPalette.GRAY_5);
		g2.draw(round);
		g2.dispose();
	}

	@Override
	public Insets getBorderInsets(Component c) {
		return new Insets(3, 2, 3, 2);

	}

	@Override
	public Insets getBorderInsets(Component c, Insets insets) {
		insets.left = insets.right = 1;
		insets.top = insets.bottom = 3;
		return insets;
	}
}
