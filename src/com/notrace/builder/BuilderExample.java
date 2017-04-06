package com.notrace.builder;

/**
 * ����ģʽ����һ�ֶ��󹹽�ģʽ��
 * �����Խ����Ӷ���Ľ�����̳��������������𣩣�
 * ʹ���������̵Ĳ�ͬʵ�ַ������Թ������ͬ���֣����ԣ��Ķ���
 * ���������ʹ��������ģʽ��
 *���������Ӷ�����㷨Ӧ�ö����ڸö������ɲ����Լ����ǵ�װ�䷽ʽʱ��
 *��������̱�����������Ķ����в�ͬ�ı�ʾʱ��
 * @author notrace
 *
 */
public class BuilderExample {

	public static void main(String[]args){
		Waiter waiter=new Waiter();
		PizzaBuilder hawaiian_pizzabuilder =new HawaiianPizzaBuilder();
		PizzaBuilder spicy_pizzabuilder= new SpicyPizzaBuilder();
		waiter.setPizzaBuilder(hawaiian_pizzabuilder);
		waiter.constructPizza();
		
		Pizza pizza=waiter.getPizza();
	}
}
