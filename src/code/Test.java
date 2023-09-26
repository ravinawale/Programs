package code;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		
		int[]  x = {120, 200, 016};
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i] + " ");
		}  
		
		Arrays.stream(x).boxed().findFirst();
		Arrays.stream(x).boxed().skip(1);
		Arrays.stream(x).boxed().limit(0);
		Arrays.stream(x).boxed().noneMatch(null);
			  
			  
		Comparator<String> cmp = (e1, e2) -> e1.compareTo(e2);
			
	}
	
}
