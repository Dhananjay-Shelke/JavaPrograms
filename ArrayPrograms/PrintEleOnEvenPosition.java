package core;

public class PrintEleOnEvenPosition {
	public static void print(int[] arr) {
		for(int i =1; i<arr.length-1; i=i+2) {
			//OR  for(int i =1; i<arr.length-1; i++)
			//    i++;
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		print(arr);
	}
}
