package code.java8;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondMaxAndReturnItCube {
	
	static int[] numbers = {1,2,3,4,5,6};  
	
	public static void main(String[] args) {
		
		int[] numbers = {5, 9, 11, 2, 8, 21, 1};
		
		System.out.println(
			Arrays.stream(numbers)
			                .boxed()
			                .sorted(Comparator.reverseOrder())
			                .skip(1)
			                .findFirst()
			                .map(e -> e*3)
			                .get()
		);
		
		System.out.println(
				Arrays.stream(numbers)
				                .boxed()
				                .sorted(Comparator.reverseOrder())
				                .mapToInt(Integer::intValue)
				                .sum()
		);
		
    }
}	
