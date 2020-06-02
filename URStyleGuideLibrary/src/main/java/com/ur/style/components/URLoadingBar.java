package com.ur.style.components;

import javax.swing.JProgressBar;

import com.ur.impl.director.LoadingBarDirector;

/**
 * This class creates all the types of loading bars with the looks 
 * and feels according to the UR style guide.
 * @author Bruger
 *
 */
public class URLoadingBar {

	private LoadingBarDirector loadingBarDirector = new LoadingBarDirector();

	public URLoadingBar() {
	}

	public JProgressBar getThickLoadingBar(int width) {

		JProgressBar progressBar = loadingBarDirector.BuildLoadingBar(width, false);
		return progressBar;

	}

	public JProgressBar getThinLoadingBar(int width) {

		JProgressBar progressBar = loadingBarDirector.BuildLoadingBar(width, true);
		return progressBar;

	}

	public JProgressBar getThinLoadingBarWithText(int width, String text) {

		JProgressBar progressBar = loadingBarDirector.BuildLoadingBar(width, true);
		progressBar.setStringPainted(true);
		progressBar.setString(text);

		return progressBar;

	}

}
