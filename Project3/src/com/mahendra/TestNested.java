package com.mahendra;

import static com.mahendra.IronMan.Human;

import com.mahendra.IronMan.Suite;

public class TestNested {

	public static void main(String[] args) {
		IronMan man = new IronMan();
		//Creating new nested STATIC class object from OUTSIDE outer class
		IronMan.Human tony = new Human();
		//Creating new nested class object from INSIDE 
		//Outer class object
		IronMan.Suite suite = man.new Suite();
	}

}
