package core;
//Print Odd and Even Numbers from an array
public class Odd_EvenFromArray {
	
	public static void OddEven(int arr[]) {
		System.out.print("Even numbers:");
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] % 2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
			
		}
		System.out.print("\nOdd numbers:");
		for(int i=0; i<arr.length ; i++) {
			if(arr[i] % 2 != 0)
			{
				System.out.print(arr[i] + " ");
			}
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,5};
		
		OddEven(arr);
	}
}
