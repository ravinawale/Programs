package code.java8;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		
		int arr[] = {1,3,4}; 
		int arr1[]= {4,1,3};
		int arr2[]= {3,6,1,45,9}; 
		int arr3[]= {6,9,12,56,89}; 
		
		System.out.println(isSortedUsingStream(arr));
		System.out.println(isSortedUsingStream(arr1));
		System.out.println(isSortedUsingStream(arr2));
		System.out.println(isSortedUsingStream(arr3));
	}
	

   public static boolean isSorted(int arr[]){
		Set<Integer> setData = new LinkedHashSet<Integer>();
		
		for(int ele :arr){
		   setData.add(ele);
		}
		
		int count=0;
		for(int ele :setData){
		   if(arr[count] != ele) return false;
		   count++;
		}
		
		return true;
   }

   public static boolean isSorted2(int arr[]){
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		
		return true;
   }

   public static boolean isSortedUsingStream(int arr[]){
		return IntStream.range(0, arr.length-1)
		         .noneMatch(i -> arr[i] > arr[i+1]);
   }
   
}
