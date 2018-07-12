package com.mahendra;

public class IronMan {
	private Human tony = new Human();
	private Suite jarvis = new Suite();
	
	public class Suite{
		private String name="Jarvis";
		
		public String toString() {
			return name;
		}
	}
	
	static class Human{
		private String name ="tony stark";
		
		public String toString() {
			return name;
		}
	}
	
	@Override
	public String toString() {
		return tony+" "+jarvis;
	}
}
