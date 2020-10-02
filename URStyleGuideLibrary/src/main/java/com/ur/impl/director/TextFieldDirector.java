package com.ur.impl.director;

import javax.swing.JTextField;

import com.ur.impl.builder.ITextFieldBuilder;
import com.ur.impl.builder.objects.BuilderLibrary;
import com.ur.impl.builder.objects.TextFieldBuilder;

public class TextFieldDirector extends BuilderLibrary {

	private ITextFieldBuilder builder = new TextFieldBuilder();

	public JTextField BuildTextField(int width, boolean enable) {

		if (enable) {
			builder.setEnabled(true);
		} else {
			builder.setEnabled(false);
		}

		builder.setWidth(width);
		builder.build();
		return builder.getComponent();
	}
}
