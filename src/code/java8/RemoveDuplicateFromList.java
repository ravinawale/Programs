package code.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		 
		myList.stream()
		 	   .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()))
		 	   .entrySet().stream()
		 	   .filter(e -> e.getValue()>1)
		 	   .map(e -> e.getKey())
		 	   .collect(Collectors.toList())
		 	   .forEach(System.out::println);
		 
		 //Using set approch
		 Set<Integer> set = new HashSet();
		 myList.stream()
		 	   .filter(e -> !set.add(e))
		 	   .forEach(System.out::println); 
	}
}
