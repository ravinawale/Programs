package code.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInGivenString {

	public static void main(String[] args) {
       
	   String str = new String("Sakkett");
       char[] chars = str.toCharArray();
       
       for (int i=0; i<str.length();i++) {
           for(int j=i+1; j<str.length();j++) {
              if (chars[i] == chars[j]) {
                   System.out.println(chars[j]);
               }
            }
       }
       
       //Using Java 8 Stream 
       Arrays.stream(str.split(""))
       		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
       		 .entrySet().stream()
       		 .filter(e -> e.getValue()>1)
       		 .map(e-> e.getKey())
       		 .forEach(System.out::println);
	}
}
