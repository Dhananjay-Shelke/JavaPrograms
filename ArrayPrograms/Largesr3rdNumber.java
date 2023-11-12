package core;

//Find 3rd Largest Number in an array
public class Largesr3rdNumber {
	static void largestOf3Number(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Third largest: " + arr[arr.length - 3]);
	}

	public static void main(String[] args) {
		int arr[] = { 40, 50, 60, 10, 20, 30 };
		largestOf3Number(arr);
	}
}
