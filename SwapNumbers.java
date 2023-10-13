package com.programs;
//6. How to swap 2 no using 3rd variable   Program in java 
import java.util.*;
public class SwapNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter value of b: ");
		int b = sc.nextInt();
		
		System.out.println("Before Swap : \n a="+ a +"\n b=" +b);
		int temp =a;
		a=b;
		b=temp;
		
		System.out.println("After Swap : \n a="+ a +"\n b=" +b);
		
	}

}
