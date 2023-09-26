package code.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFruitHavingMaxPrice {

	public static void main(String args[] ) {
		Map<String,Integer> data = new HashMap();
		
		data.put("F1", 200);
		data.put("F2", 300);
		data.put("F3", 100);
		data.put("F4", 400);
		data.put("F5", 600);
		
		List data1 = data.entrySet()
			.stream()
			.filter(f -> f.getValue()>200)
			.map(e -> e.getKey())
			.collect(Collectors.toList());
		
		System.out.println(data1);
	}
}
