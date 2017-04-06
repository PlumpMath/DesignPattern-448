package com.notrace.builder;

/**
 * 建造模式，是一种对象构建模式。
 * 它可以将复杂对象的建造过程抽象出来（抽象类别），
 * 使这个抽象过程的不同实现方法可以构造出不同表现（属性）的对象。
 * 在以下情况使用生成器模式：
 *当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时；
 *当构造过程必须允许被构造的对象有不同的表示时。
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
