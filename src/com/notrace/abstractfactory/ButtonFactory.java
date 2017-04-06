package com.notrace.abstractfactory;

public class ButtonFactory {
	public static Button createMacButton(){
		return new MacButton();
	}
	public static Button createWinButton(){
		return new WinButton();
	}

}
