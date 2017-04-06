package com.notrace.abstractfactory;

public class BorderFactory {

	public static Border createMacBorder(){
		return new MacBorder();
	}
	public static Border createWinBorder(){
		return new WinBorder();
	}
}
