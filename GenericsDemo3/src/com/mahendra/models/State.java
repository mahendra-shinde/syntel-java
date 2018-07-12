package com.mahendra.models;

public class State {
	private String name;
	private String capitalCity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapitalCity() {
		return capitalCity;
	}
	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}
	public State(String name, String capitalCity) {
		super();
		this.name = name;
		this.capitalCity = capitalCity;
	}
	
}
