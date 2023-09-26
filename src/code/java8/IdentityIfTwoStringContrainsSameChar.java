

package code.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class IdentityIfTwoStringContrainsSameChar {

	public static void main(String[] args) {

		String FIRST  ="RACE";
		String SECIND ="ECAR";
		
		/*String s1 = Arrays.stream(FIRST.split(""))
					.sorted()
					.collect(Collectors.joining(""));
		
		String s2 = Arrays.stream(SECIND.split(""))
					.sorted()
					.collect(Collectors.joining(""));
		
		if(s1.equals(s2)) {
			System.out.println("Contrainning same characters ");
		}else {
			System.out.println("Not contrainig same characters ");
		}*/
		
		System.out.println(hasSameChar("RACE","ECARP"));
	}
	
	public static boolean hasSameChar(String s1, String s2) {
	  Set<String> set1 = new HashSet<String>(Arrays.asList(s1.split("")));
	  Set<String> set2 = new HashSet<String>(Arrays.asList(s2.split("")));
		
	  if(set1.size()!=set2.size()) return false;
	  
	  long count = set1.stream()
	  	  .filter(ele -> !set2.contains(ele))
	  	  .count();
	  
	  return count>0?false:true;
	}
	
}
