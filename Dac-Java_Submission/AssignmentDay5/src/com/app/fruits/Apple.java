package com.app.fruits;

public class Apple extends Fruit {
//	private String color;
//	private double weight;
//	private String name;
//	private boolean fresh;
	
	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet and sour";
	}
	
	public void jam() {
		System.out.println("Name: "+super.getName()+
				" Weight : "+super.getWeight()+" making jam!");
	}
	
	
	
	

}
