package com.ur.impl.builder.objects;

import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;

public abstract class BuilderLibrary {
	protected URBorder urBorder = new URBorder();
	protected URColorPalette urColorPalette = new URColorPalette();
	protected URLayout urLayout = new URLayout();
	protected URTypegraphy urTypegraphy = new URTypegraphy();
}
