package code.hashmap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxSalaryByDept {

	public static void main(String[] args) {
		
		List<MyEmployee1> lst = Arrays.asList(new MyEmployee1(1,"ravi",5000.00,"D1"),
	 			  new MyEmployee1(2,"ganesh",6000.00,"D1"),
	 			  new MyEmployee1(3,"pravin",3000.00,"D2"),
	 			  new MyEmployee1(4,"parigha",5000.00,"D2"));
		
		Map<String, Double> data = lst.stream()
									  .collect(Collectors.groupingBy(MyEmployee1::getDept,
														             Collectors.collectingAndThen(
														            		    Collectors.maxBy(Comparator.comparing(MyEmployee1::getSalary)), 
														            		    e -> e.get().salary )));
		
		Map<String, Double> data2 = lst.stream()
									.collect(Collectors.groupingBy(MyEmployee1::getDept, 
											 Collectors.summingDouble(MyEmployee1::getSalary)));
		
		System.out.println(data);
		System.out.println(data2);
	}
	
	public static Double getSalary(MyEmployee1 emp) {
		return emp.getSalary();
	}
	
}
