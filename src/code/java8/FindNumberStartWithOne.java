package code.java8;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartWithOne {

	public static void main(String[] args) {
		 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		 myList.stream()
		 	   .map(num -> num+"")
		 	   .filter(ele -> ele.startsWith("1"))
		 	   .forEach(System.out::println);
	}

}
