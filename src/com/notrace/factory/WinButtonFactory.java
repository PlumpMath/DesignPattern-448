package com.notrace.factory;

public class WinButtonFactory implements ButtonFactory{
	public Button createButton(){
		return new WinButton();
	}
	

}
