package com.notrace.proxy;

/**
 * ����ģʽ��Ӣ�Proxy Pattern���ǳ�������е�һ�����ģʽ��
��ν�Ĵ�������ָһ����������Ϊ���������Ľӿڡ�
�����߿������κζ����Ľӿڣ��������ӡ��洢���еĴ����
�ļ�������������޷����Ƶ���Դ��
�����Ĵ���ģʽ����Ϊ���ü�����Ӣ�reference counting��ָ�����
��һ�����Ӷ���Ķ�ݸ��������ʱ������ģʽ���Խ����Ԫģʽ�Լ��ٴ洢��������
���������Ǵ���һ�����Ӷ��󼰶�������ߣ�ÿ�������߻����õ�ԭ���ĸ��Ӷ���
�������ڴ����ߵ������ת�͵�ԭ������һ�����еĴ����߶�������ʱ��
���Ӷ���ᱻ�Ƴ���
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
