package core;

public class ArrayReverse {
	
	public static void  reverse(int[] arr) {
		System.out.print("\nAfter: ");
		for(int i=arr.length-1 ; i>=0 ; i--) {
		           System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		System.out.print("Before: ");
		for(int i : arr)
			System.out.print(i + " ");
		reverse(arr);
		
	}
	
}
