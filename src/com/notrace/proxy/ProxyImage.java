package com.notrace.proxy;

public class ProxyImage implements Image{
	private String fileName;
	private Image image;
	public ProxyImage(String fileNmae){
		this.fileName=fileName;
	}
	
	public void displayImage(){
		if(image==null){
			image=new RealImage(fileName);
		}
		image.displayImage();
	}

}
