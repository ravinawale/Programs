package code.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountNumberOfWorldInString {

	 public static void main(String[] args) {
		 
	        String str = "This this is is done by Saket Saket";
	        String[] split = str.split(" ");
	         
	        //Using Hash map
	        HashMap<String,Integer> map = new HashMap<String,Integer>();
	        for (int i=0; i<split.length; i++) {
	            if (map.containsKey(split[i])) {
	                int count = map.get(split[i]);
	                map.put(split[i], count+1);
	            }
	            else {
	                map.put(split[i], 1);
	            }
	        }
	        //System.out.println(map);
	        
	        //Using Stream API
	        Map<String, Long> result = Arrays.asList(str.split(" "))
	        				 .stream()
	        				 .map(e -> e.toLowerCase())
	        				 .collect(Collectors.groupingBy(String::toString,Collectors.counting()));
	        				 
	        System.out.println(result);
	  }
}
