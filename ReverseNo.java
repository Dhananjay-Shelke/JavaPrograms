package com.programs;

import java.util.*;

public class ReverseNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter a Number: ");
		int num = sc.nextInt(); // 325
		int rem;

		while (num > 0) {
			rem = num % 10; // 5
			System.out.print(rem);
			num = num / 10;
		}

	}
}