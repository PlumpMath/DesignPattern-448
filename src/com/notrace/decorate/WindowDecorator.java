package com.notrace.decorate;

public abstract class WindowDecorator extends SimpleWindow{

	protected Window decoratedWindow;
	public WindowDecorator(Window decoratedWindow){
		this.decoratedWindow=decoratedWindow;
	}
	
}
