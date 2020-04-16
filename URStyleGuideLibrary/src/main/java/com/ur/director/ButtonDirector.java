package com.ur.director;

import javax.swing.JButton;

import com.ur.builder.IButtonBuilder;
import com.ur.builder.objects.BuilderLibrary;
import com.ur.builder.objects.ButtonBuilder;
import com.ur.builder.objects.CTAButtonBuilder;

public class ButtonDirector extends BuilderLibrary{
	
	private IButtonBuilder builderButton = new ButtonBuilder();
	private IButtonBuilder builderCTAButton = new CTAButtonBuilder();
	
	public JButton BuildButton(int width, boolean enabled, boolean small) {
		
		if(small) {
			builderButton.setHeight(urBorder.HEIGHT_MEDIUM);
		}else {
			builderButton.setHeight(urBorder.HEIGHT_HUGE);
		}
		
		builderButton.setEnabled(enabled);
		builderButton.setWidth(width);
		builderButton.build();
		return builderButton.getComponent();
		
	}
	
	public JButton BuildCTAButton(int width, boolean enabled, boolean small) {
		
		if(small) {
			builderCTAButton.setHeight(urBorder.HEIGHT_MEDIUM);
		}else {
			builderCTAButton.setHeight(urBorder.HEIGHT_LARGE);
		}
		
		builderCTAButton.setEnabled(enabled);
		builderCTAButton.setWidth(width);
		builderCTAButton.build();
		return builderCTAButton.getComponent();
	}

}
