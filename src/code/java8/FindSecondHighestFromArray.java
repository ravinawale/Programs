package code.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondHighestFromArray {

	public static void main(String[] args) {

		 int arr[] = {12,2,18,3,13,15,50,45};
	  
		 //Using Java Stream 
		 Optional<Integer> second  = Arrays.stream(arr)
					  .boxed()
					  .sorted(Comparator.reverseOrder())
					  .skip(1)
					  .findFirst();
		 System.out.println(second);
		 
		 //Using Swapping 
		 for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]>arr[i]){
				   int temp =arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
				}
			}
		}
		System.out.println(arr[1]);
		
		//Using Sorted collection
		List<Integer> v = new ArrayList<>(Arrays.asList(12,2,18,3,13,15,50,45));
        Set<Integer> s = new TreeSet<>(v);
        for (int value : s) {
            v.add(value);
        }
        int n = v.size();
        System.out.print("The Second Largest Element is: "+v.get(v.size()-2));
	}

}
