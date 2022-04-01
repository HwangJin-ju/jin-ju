package com.edu.generic;

// ArrayList<Integer>
public class Box<T> { // 어떤 유형이든 필드값으로 다 담아낼 용도
	T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return this.obj;
	}
}
