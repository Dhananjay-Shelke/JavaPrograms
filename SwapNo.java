package com.programs;

import java.util.Scanner;

//7. How to swap 2 no without using 3rd variable   
//Program in java 
public class SwapNo {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X= ");
		int X = sc.nextInt();
		
		System.out.println("Enter Y= ");
		int Y = sc.nextInt();
		
		System.out.println("Before Swapping:\nX= "+ X + "\nY= " + Y);
		
		X =	X + Y; //X = 10 + 20
		Y = X - Y; //Y = 10
		X = X - Y; //X = 20
		
		System.out.println("After Swapping:\nX= "+ X + "\nY= " + Y);
		
	}
}
