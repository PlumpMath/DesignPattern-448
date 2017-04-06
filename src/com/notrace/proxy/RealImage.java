package com.notrace.proxy;

public class RealImage implements Image{
	private String fileName;
	public RealImage(String fileName){
		this.fileName=fileName;
		loadImageFromDisk();
		
	}
	public void displayImage()
	{
		System.out.println("Displaying "+fileName);
	}
	private void loadImageFromDisk(){
		System.out.println("Loading "+fileName);
	}

}
