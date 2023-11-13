package core;
//print the largest element in an array
import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
	// 5,1,2,7,8,
	public static int largestElement(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		int largest = largestElement(arr);
		System.out.println("largest element : " + largest);
	}
}
