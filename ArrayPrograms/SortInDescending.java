package core;

//Sort the array in descending order   
import java.util.Arrays;

public class SortInDescending {
	public static void sortAscending(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("\nAfter sort: " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[] = { 5, 3, 8, 2, 6, 7, 1, 4, 9 };
		System.out.print("Before sort: " + Arrays.toString(arr));

		sortAscending(arr);
	}

}
