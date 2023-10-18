package com.programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int flag = 0;
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		if(num == 0 || num == 1)
			System.out.println(num + " is not a Prime Number. ");
		else
		{
			for(int i = 2; i <=num/2 ; i++) {
				if(num % i == 0) {
				System.out.println(num + " is not a Prime Number.");
				flag = 1;
				break;	
				}
			}
		}
		if(flag == 0) {
			System.out.println(num + " is a Prime Number.");
		}
		

	}

}
