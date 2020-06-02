package com.ur.impl.director;

import javax.swing.JProgressBar;

import com.ur.impl.builder.ILoadingBarBuilder;
import com.ur.impl.builder.objects.BuilderLibrary;
import com.ur.impl.builder.objects.LoadingBarBuilder;

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
