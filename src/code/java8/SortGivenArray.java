package code.java8;

import java.util.Arrays;


//Array Sorting
public class SortGivenArray {

	public static void main(String[] args) {
		
		int[] arr = {8,3,5,6,7,4,7};
		System.out.println(arr);
		
		//1. Arrays sorting 
		Arrays.sort(arr);
		
		//Using Stream 
		arr = Arrays.stream(arr).sorted().toArray();
		
		// Using sorting algo
		/*int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j])   
				{  
					temp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = temp;  
				}
			}
		}*/
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
