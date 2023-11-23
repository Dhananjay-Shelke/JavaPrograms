package com.entity;


public class StackFixedImpl implements Stack{
	private int top=-1;
	private Customer[] customers;
	
//	public StackFixedImpl() {
//		// TODO Auto-generated constructor stub
//	}
	
	public StackFixedImpl(int size) {
		// TODO Auto-generated constructor stub
		customers=new Customer[size];
	}
	
	
	@Override
	public void push(Customer newCustomer) {
		
		customers[++top]=newCustomer;
		
		System.out.println("Customer added");
		
		
	}

	@Override
	public Customer pop() throws StackOverflowError {
		if(top==-1) {
			throw new StackOverflowError("No elements to pop");
		}
		else {
			return customers[top--];
		}
		
	}
	
}