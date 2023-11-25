package core;

import java.util.Arrays;

public class ShiftElementsLeft {
	private static void shift(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int temp = arr[i];  //temp = 1
			arr[i] = arr[i+1];  //arr[0] = 2;
			arr[i+1] = temp;    //arr[1] = 1;
 			}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));
		shift(arr);
		
	}

}
