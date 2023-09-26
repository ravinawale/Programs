package code.scenariobased;

import java.util.Arrays;
import java.util.List;

public class IndentifyArrrayContainsOnlyOddNumbers {
	
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(5,3,7,9,13,15);
		System.out.println(onlyOddNumbers(list));
		System.out.println(onlyOddNumbersStream(list));
	}
	
	//Using Modulo 
	public static boolean onlyOddNumbers(List<Integer> list) {
		for (Integer ele : list) {
			if(ele %2 ==0) return false;
		}
		return true;
	}

	//Using Modulo with stream
	public static boolean onlyOddNumbersStream(List<Integer> list) {
		return list
			   .parallelStream() // parallel stream for faster processing
			   .anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
	}
	
	
	
}
