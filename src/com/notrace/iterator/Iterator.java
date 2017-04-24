package com.notrace.iterator;

public interface Iterator<T> {

	T first();
	T next();
	boolean isDone();
	T currentItem();
}
