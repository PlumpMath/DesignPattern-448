package com.notrace.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String args[]){
		List<Object> list=new ArrayList<>();
		list.add("miner");
		list.add("any");
		Aggregate<Object>agg=new ConcreteAggregate<>(list);
		Iterator<Object> iterator=agg.createIterator();
		iterator.first();
		while(!iterator.isDone()){
			System.out.println(iterator.currentItem());
			iterator.next();
		}
	}

}
