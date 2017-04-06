package com.notrace.factory;

public class MacButtonFactory implements ButtonFactory{
	public Button createButton(){
		return new MacButton();
	}

}
