package com.programs;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Print its Table: ");
		int num = sc.nextInt();
		
		System.out.println("Table of "+num);
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}

	}

}
