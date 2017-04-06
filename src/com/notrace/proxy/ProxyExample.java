package com.notrace.proxy;

/**
 * 代理模式（英语：Proxy Pattern）是程序设计中的一种设计模式。
所谓的代理者是指一个类别可以作为其它东西的接口。
代理者可以作任何东西的接口：网络连接、存储器中的大对象、
文件或其它昂贵或无法复制的资源。
著名的代理模式例子为引用计数（英语：reference counting）指针对象。
当一个复杂对象的多份副本须存在时，代理模式可以结合享元模式以减少存储器用量。
典型作法是创建一个复杂对象及多个代理者，每个代理者会引用到原本的复杂对象。
而作用在代理者的运算会转送到原本对象。一旦所有的代理者都不存在时，
复杂对象会被移除。
 * @author notrace
 *
 */
public class ProxyExample {
	public static void main(String[]args){
		Image image1=new ProxyImage("image1");
		Image image2=new ProxyImage("image2");
		
		image1.displayImage();
		image2.displayImage();
	}
}
