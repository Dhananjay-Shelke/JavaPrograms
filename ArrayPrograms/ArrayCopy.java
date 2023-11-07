package core;

import java.util.Iterator;
import java.util.Scanner;

//Program to copy all elements of one array into another array
public class ArrayCopy {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int arr1[] = new int[size];

		// accepting elements in array1
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1) + " :");
			arr1[i] = sc.nextInt();
		}

		// printing array1 elements using forEach loop
		System.out.println("Arrray 1 Elements:");
		for (int i : arr1)
			System.out.println(i);

		// creating array2 to copy elements of array1
		int arr2[] = new int[arr1.length];

		// copying array 1 elements in another array
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		// printing array2 elements using forEach loop
				System.out.println("Arrray 2 Elements:");
				for (int i : arr2)
					System.out.println(i);
	}
}
