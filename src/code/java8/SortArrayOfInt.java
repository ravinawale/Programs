package code.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortArrayOfInt {

	public static void main(String args[]) {
		
	  int arr[] = {1,4,6,3,10,5,9,21};
	  	
	  System.out.println(Arrays.stream(arr)
	        .boxed()
	  		.sorted(Comparator.naturalOrder())
	  		.collect(Collectors.toList()));
	}
}
