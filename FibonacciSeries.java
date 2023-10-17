package com.programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Fibonacci series
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = 1;
		
		System.out.print("Enter number of Fibonacci elements: ");
		int elements = sc.nextInt();
		
		System.out.print(n1 + " " + n2 + " ");
		
		for(int i =2 ; i < elements ; i++)//loop starts from 2 because 0 and 1 are already printed    
		{
			int n3 = n1 + n2; //n3 = 1
			
			System.out.print(n3 + " ");
			n1 = n2; //n1 = 1
			n2 = n3; //n2 = 1
			
		}
	}

}
