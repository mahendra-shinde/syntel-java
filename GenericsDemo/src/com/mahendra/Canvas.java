package com.mahendra;

@Author(name="Mahendra Shinde")
public class Canvas <T>{
	private T obj ;

	public Canvas(T obj) {
		this.obj = obj;
	}
	
	public void draw() {
		System.out.println(obj);
	}
}
