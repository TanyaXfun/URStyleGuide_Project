package com.ur.style.components;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import com.ur.director.LoadingBarDirector;
import com.ur.ekstra.RoundCornerBorder;
import com.ur.style.URBorder;
import com.ur.style.URColorPalette;
import com.ur.style.URLayout;
import com.ur.style.URTypegraphy;


public class URLoadingBar {
	
	private JToggleButton togglebutton = new JToggleButton();
	private URBorder urBorder = new URBorder();
	private URColorPalette urColorPalette = new URColorPalette();
	private URLayout urLayout = new URLayout();
	private URTypegraphy typegraphy = new URTypegraphy();
	
	private LoadingBarDirector loadingBarDirector = new LoadingBarDirector();
	
	public URLoadingBar() {
		// TODO Auto-generated constructor stub
	}
	
	public JProgressBar getThickLoadingBar(int width) {
		
		JProgressBar progressBar = loadingBarDirector.BuildLoadingBar(width, false);
		
//		JProgressBar progressBar = new JProgressBar();
//		Border border = BorderFactory.createEmptyBorder(urBorder.BORDER_THIN,urBorder.BORDER_THIN,urBorder.BORDER_THIN,urBorder.BORDER_THIN);
//		
//		progressBar.setPreferredSize(new Dimension(width,urBorder.HEIGHT_DEFAULT));
//		progressBar.setMaximumSize(progressBar.getPreferredSize());
//		progressBar.setBorder(border);
//		progressBar.setBorder(new RoundCornerBorder());
//		progressBar.setForeground(urColorPalette.UR_BLUE);
//		
//		progressBar.setIndeterminate(true);
//		//do some work; get length of task...
//		progressBar.setMaximum(100);
//		progressBar.setValue(100);
//		progressBar.setIndeterminate(false);
		
		
		return progressBar;
		
	}
	public JProgressBar getThinLoadingBar(int width) {
		
		JProgressBar progressBar = loadingBarDirector.BuildLoadingBar(width, true);
		
		
//		JProgressBar progressBar = new JProgressBar(SwingConstants.CENTER);
//	
//		Border border = BorderFactory.createEmptyBorder(urBorder.BORDER_THIN,urBorder.BORDER_THIN,urBorder.BORDER_THIN,urBorder.BORDER_THIN);
//		
//		progressBar.setPreferredSize(new Dimension(width,urBorder.HEIGHT_TINY));
//		progressBar.setMaximumSize(progressBar.getPreferredSize());
//		progressBar.setBorder(border);
//		progressBar.setBorder(new RoundCornerBorder());
//		progressBar.setForeground(urColorPalette.UR_BLUE);
//		
//		progressBar.setIndeterminate(true);
//		//do some work; get length of task...
//		progressBar.setMaximum(100);
//		progressBar.setValue(100);
//		progressBar.setIndeterminate(false);
		
		
		return progressBar;
		
	}

	
	public JProgressBar getThinLoadingBarWithText(int width, String text) {
		
		
		JProgressBar progressBar = loadingBarDirector.BuildLoadingBar(width, true);
		progressBar.setString(text);
		
		
//		JProgressBar progressBar = new JProgressBar(SwingConstants.CENTER);
//	
//		Border border = BorderFactory.createEmptyBorder(urBorder.BORDER_THIN,urBorder.BORDER_THIN,urBorder.BORDER_THIN,urBorder.BORDER_THIN);
//		Font font = new Font(typegraphy.FontFamilie_DejaVu, typegraphy.Plain, typegraphy.FONT_SMALL);
//		
//		progressBar.setPreferredSize(new Dimension(width,urBorder.HEIGHT_TINY));
//		progressBar.setMaximumSize(progressBar.getPreferredSize());
//		progressBar.setBorder(border);
//		progressBar.setBorder(new RoundCornerBorder());
//		progressBar.setForeground(urColorPalette.UR_BLUE);
//		progressBar.setFont(font);
//		progressBar.setStringPainted(true);
//		progressBar.setString(text);
//		
//		progressBar.setIndeterminate(true);
//		//do some work; get length of task...
//		progressBar.setMaximum(100);
//		progressBar.setValue(100);
//		progressBar.setIndeterminate(false);
		
		
		return progressBar;
		
	}
}
