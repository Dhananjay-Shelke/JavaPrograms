package com.app.fruits;

public class Orange extends Fruit {
	
//	private String color;
//	private double weight;
//	private String name;
//	private boolean fresh;
	
	public Orange(String color, double weight, String name ) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	
	public void juice() {
		System.out.println("Name: "+super.getName()+
				" Weight : "+super.getWeight()+" extracting juice");
	}
	

}
