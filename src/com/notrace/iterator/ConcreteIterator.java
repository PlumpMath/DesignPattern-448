package com.notrace.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator<T> implements Iterator{
	private List<T>list=new ArrayList<>();
	private int curr=0;
	public ConcreteIterator(List<T>list){
		this.list=list;
	}
	@Override
	public T first() {
		return list.get(0);
	}

	@Override
	public T next() {
		T ret=null;
		curr++;
		if(curr<list.size()){
			ret=list.get(curr);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return curr>=list.size()?true:false;
	}

	@Override
	public T currentItem() {
		return list.get(curr);
	}

}
