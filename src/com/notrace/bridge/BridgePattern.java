package com.notrace.bridge;

/**
 * 
 * 将一个抽象与实现解耦，以便两者可以独立的变化。
 * 桥接模式是软件设计模式中最复杂的模式之一，
 * 它把事物对象和其具体行为、具体特征分离开来，
 * 使它们可以各自独立的变化。事物对象仅是一个抽象的概念。
 * 如“圆形”、“三角形”归于抽象的“形状”之下，而“画圆”、
 * “画三角”归于实现行为的“画图”类之下，然后由“形状”调用“画图”。
 * @author notrace
 *
 */
public class BridgePattern {
	public static void main(String[]args){
		Shape[]shapes=new Shape[2];
		shapes[0]=new CircleShape(1,2,3,new DrawingAPI1());
		shapes[1]=new CircleShape(5,7,11,new DrawingAPI2());
		
		for(Shape shape:shapes){
			shape.resizeByPercentage(2.5);
			shape.draw();
		}
	}
}
