package com.entity;

public class StackImplGrowable implements Stack {
	private int top =-1;
	private Customer[] customers =new Customer[2];
	
	StackImplGrowable() {
		
	}

	@Override
	public void push(Customer newCustomer) {
		if(isFull()) {
			Customer[] temp = new Customer[2*customers.length];
			
			for(int i=0;i<customers.length;i++) {
				temp[i]=customers[i];
				
			}
			customers=temp;
			customers[++top]=newCustomer;
			
		}else {
		customers[++top]=newCustomer;
		
		System.out.println("Customer added");
		}
	}

	@Override
	public Customer pop() {
		try{
			if(top==-1) {
			throw new StackOverflowError("No elements to pop");
		}
		else {
			return customers[top--];
			}
		}catch(StackOverflowError e) {
			System.out.println(e.getMessage());
			
		}
		return null;
	}
	
	boolean isFull() {
			return (top==customers.length-1);
	}
	
	

}
