package code.java8;

import java.util.Arrays;

public class FindDistinctElementsAndReturnItSquare {

	public static void main(String[] args) {
		int[] numbers = {5,5, 9, 11, 2, 8, 21, 1};
		
		numbers = Arrays.stream(numbers)
				.distinct()
				.map(e -> e*2).toArray();
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
    }
}
