package com.notrace.bridge;

/**
 * 
 * ��һ��������ʵ�ֽ���Ա����߿��Զ����ı仯��
 * �Ž�ģʽ��������ģʽ����ӵ�ģʽ֮һ��
 * �������������������Ϊ�������������뿪����
 * ʹ���ǿ��Ը��Զ����ı仯������������һ������ĸ��
 * �硰Բ�Ρ����������Ρ����ڳ���ġ���״��֮�£�������Բ����
 * �������ǡ�����ʵ����Ϊ�ġ���ͼ����֮�£�Ȼ���ɡ���״�����á���ͼ����
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
