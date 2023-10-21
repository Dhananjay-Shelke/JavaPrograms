package com.programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a, b, c, largest, temp;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter the third number:");
		c = sc.nextInt();
		// comparing a and b and storing the largest number in a temp variable
		temp = a > b ? a : b;

		largest = c > temp ? c : temp;

		System.out.println("The largest number is: " + largest);
	}
}
