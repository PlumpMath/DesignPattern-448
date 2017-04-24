package com.notrace.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> extends Aggregate{

	private List<T>list=new ArrayList<>();
	
	 public ConcreteAggregate(List<T>list) {
		 this.list=list;
	}
	@Override
	Iterator createIterator() {
		return new ConcreteIterator<>(list);
	}

}
