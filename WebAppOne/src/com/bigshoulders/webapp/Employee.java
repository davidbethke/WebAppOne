package com.bigshoulders.webapp;

public class Employee {
	private String name;
	private int id;
	// no arg constructor
	public Employee(){};
	public Employee(String name, int id	){
		this.name=name;
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setId(int id){
		this.id=id;
	}

}
