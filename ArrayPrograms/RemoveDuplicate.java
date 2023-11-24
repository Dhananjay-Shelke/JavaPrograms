package core;

import java.util.Arrays;

//Remove Duplicate Element in an array
public class RemoveDuplicate {

	public static int removeDups(int arr[]) {
		int temp[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}

		}
		temp[j++] = arr[arr.length - 1];
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 9, 1, 8, 3, 4, 3, 6 };
		Arrays.sort(arr);
		int len = removeDups(arr);
		for (int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
	}
}
