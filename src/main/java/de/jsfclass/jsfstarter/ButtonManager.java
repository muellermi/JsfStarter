package de.jsfclass.jsfstarter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ButtonManager {
	private boolean button1visible = true;

	public boolean getButton1visible() {
		return button1visible;
	}

	public void setButton1visible(Boolean button1visible) {
		this.button1visible = button1visible;
	}

	public void showButton2() {
		button1visible = false;
	}

	public void showButton1() {
		button1visible = true;
	}
}
