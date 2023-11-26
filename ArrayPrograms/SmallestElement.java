package core;
//print the smallest element in an array
public class SmallestElement {
	
	public static int smallestElement(int arr[]) {
		int smallest = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
	}
	public static void main(String[] args) {
		int arr[] = {50,40,90,10,60,30};
		System.out.println(smallestElement(arr));
	}

}
