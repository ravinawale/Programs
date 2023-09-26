package code.hashmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToMap {

	public static void main(String[] args) {
		List<String> lst = Arrays.asList("ABC",null,"XYZ","ABC");
		
		System.out.println(lst.stream()
		   .distinct()
		   .filter(e -> e!=null)
		   .collect(Collectors.toMap(String::toString,String::toString)));
	}
}
