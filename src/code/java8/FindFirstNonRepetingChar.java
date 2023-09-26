package code.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepetingChar {

	public static void main(String[] args) {

		String input = "Java articles are Awesome";
		List<String> lst = Arrays.asList(input.split(""));
		
		System.out.println(lst.stream()
		   .map(e -> e.toLowerCase())
		   .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		   .entrySet().stream()
		   .filter(val -> val.getValue()==1)
		   .map(ele -> ele.getKey())
		   .findFirst()
		   .get());
	}
}
