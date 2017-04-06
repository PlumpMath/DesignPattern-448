package com.notrace.decorate;

public class VerticalScrollBar extends WindowDecorator{
	public VerticalScrollBar(Window windowTobeDecorated){
		super(windowTobeDecorated);
	}
	@Override
	public void draw(){
		super.draw();
		drawVerticalScrollBar();
	}
	private void drawVerticalScrollBar(){
		
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+",including vertical scrollbars";
	}

}
