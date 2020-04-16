package com.ur.director;

import javax.swing.JProgressBar;

import com.ur.builder.ILoadingBarBuilder;
import com.ur.builder.objects.BuilderLibrary;
import com.ur.builder.objects.LoadingBarBuilder;

public class LoadingBarDirector extends BuilderLibrary {
	
	private ILoadingBarBuilder loadingBarBuilder = new LoadingBarBuilder();

	public JProgressBar BuildLoadingBar(int width, boolean thin) {
		
		if(thin) {
			loadingBarBuilder.setHeight(urBorder.HEIGHT_TINY);
		}else {
			loadingBarBuilder.setHeight(urBorder.HEIGHT_DEFAULT);
		}
		
		loadingBarBuilder.setWidth(width);
		loadingBarBuilder.setThin(thin);
		loadingBarBuilder.build();
		
		
		return loadingBarBuilder.getComponent();
	}
}
