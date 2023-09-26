package code.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayOfStringGetStringNotHavingEqualString {

	public static void main(String[] args) {
		String arr[] = {"AB","CD","BA","DC","XY","LM"};
		Arrays.stream(arr)
			   .map(e -> sort(e))
			   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())) // Map<String,Long>
			   .entrySet().stream()
			   .filter(e -> e.getValue()==1) // all 
			   .map(e -> e.getKey())
			   .forEach(System.out::println);
   }
	
   public static String sort(String e) {
	   String data[] = e.split("");
	   Arrays.sort(data);
	   return String.join("", data);
   }
}
