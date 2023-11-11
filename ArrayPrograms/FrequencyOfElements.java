package core;

public class FrequencyOfElements {

	static void frequency(int[] arr) {
		int count = 0;
		for(int i=0 ; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length ; j++) {
				if(arr[i] == arr[j])
				{
					count++;
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,8,3,2,2,2,5,1};
		frequency(arr);
	}
}

222
