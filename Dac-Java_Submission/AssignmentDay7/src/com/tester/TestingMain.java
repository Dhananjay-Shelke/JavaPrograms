package com.tester;

import java.util.Scanner;

import com.entity.Customer;
//import com.entity.Stack;
//import com.entity.StackFixedImpl;

public class TestingMain {

	public static void main(String[] args) {
		boolean flag = true;
		Customer cst=new Customer();;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Choose from following:\n"
					+ "1.Fixed size Stack\n"
					+ "2.Growable size Stack");
			int impl=sc.nextInt();
			if(impl==1) {
				System.out.println("Enter number of customers");
				
				cst.setSize(sc.nextInt());
			}else {
				cst.setSize();
			}
			
			do {
				System.out.println("2.Push "+"\n3.Pop " + " \n4.Exit ");
				switch (sc.nextInt()) {
				
				case 2:
					System.out.println("Enter Id, Name and address of Customer\n");
					int id=sc.nextInt();
					String name=sc.next();
					String address=sc.next();
					cst.push(new Customer(id,name,address));
					break;
				case 3:
					System.out.println(cst.pop()); 
					break;
				case 4:
					flag=false;
					break;
				default:
					break;
				}

			} while (flag);
		}
	}

}
