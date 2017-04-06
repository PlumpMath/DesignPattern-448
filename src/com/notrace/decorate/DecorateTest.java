package com.notrace.decorate;

public class DecorateTest {

	static void printInfo(Window w){
		System.out.println("description:"+w.getDescription());
	}
	public static void main(String[]args){
		SimpleWindow sw=new SimpleWindow();
		printInfo(sw);
		
		HorizontalScrollBar hbw=new HorizontalScrollBar(sw);
		printInfo(hbw);
		
		VerticalScrollBar vbw=new VerticalScrollBar(sw);
		printInfo(vbw);
		
	}
}
