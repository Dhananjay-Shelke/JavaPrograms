package com.app.fruits;

public class Mango extends Fruit{

//	private String color;
//	private double weight;
//	private String name;
//	private boolean fresh;
	
	
	public Mango(String color, double weight, String name ) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}



	public void pulp() {
		System.out.println("Name: "+super.getName()+
				" Weight : "+super.getWeight()+" creating pulp");
	}
	
	
}
