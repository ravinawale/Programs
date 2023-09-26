package code.hashmap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapSortByValue {

	public static void main(String[] args) {

		Map<Integer,MyEmployee1> map = new HashMap<Integer,MyEmployee1>();
		map.put(2,new MyEmployee1(2,"ravi",5000.00,"D1"));
		map.put(1,new MyEmployee1(1,"ravi",6000.00,"D2"));
		map.put(3,new MyEmployee1(3,"ravi",3000.00,"D1"));
		
		Comparator<MyEmployee1> cmp = (e1, e2) -> e2.salary.compareTo(e1.salary);
		
		/*System.out.println(map.entrySet().stream()
					  .filter(e -> e.getValue().dept.equals("D1"))
					  .sorted(Map.Entry.comparingByValue(cmp))
					  .findFirst()); */
		
		List<MyEmployee1> lst = Arrays.asList(new MyEmployee1(1,"ravi",5000.00,"D1"),
	 			  new MyEmployee1(2,"ganesh",6000.00,"D1"),
	 			  new MyEmployee1(3,"pravin",3000.00,"D2"),
	 			  new MyEmployee1(4,"parigha",5000.00,"D2"));
		
		Map<Integer,String> data =lst.stream()
		   .filter(e -> e.salary > 3000)
		   //.map(ele -> ele.getName())
		   //.collect(Collectors.toList());
		   .collect(Collectors.toMap(e-> e.id, e-> e.getName(),(e,e2)-> e,LinkedHashMap::new));
		
		//System.out.println(data);
		
		List<MyEmployee1> data2 =lst.stream()
		   .sorted(Comparator.comparing(MyEmployee1::getSalary))
		   .collect(Collectors.toList());
		
		
		Map<String, Optional<MyEmployee1>> data1 = lst.stream()
			.collect(Collectors.groupingBy(MyEmployee1::getDept,
					 					   //Collectors.filtering(e -> e.salary>3000
					 					   Collectors.maxBy(Comparator.comparing(MyEmployee1::getSalary))
					 					  ));
		System.out.println(data1);
		
		/*LinkedHashMap<Integer,Employee> sortedBySalary  
					  = map.entrySet().stream()
					  .sorted(Map.Entry.comparingByValue(cmp))
					  .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e1 ,LinkedHashMap::new));
		
					  //.findFirst()
					  //.get().getValue();
					  //.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e1 ,LinkedHashMap::new));
		
		// Sorting by Key
		LinkedHashMap<Integer,Employee> sortedByKey = map.entrySet().stream()
			      .sorted(Map.Entry.comparingByKey())
				  .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e1 ,LinkedHashMap::new));
		
		// Sorting by value 
		LinkedHashMap<Integer,Employee> sortedByValue = map.entrySet().stream()
				  .sorted(Map.Entry.comparingByValue(cmp))
				  .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)-> e1 ,LinkedHashMap::new));*/
				  
		
		//System.out.println("After : "+sortedBySalary);
		//System.out.println("Sorted : "+sorted);
	}
}

class MyEmployee1{
	Integer id;
	String name;
	Double salary;
	String dept;
	
	public MyEmployee1(Integer id, String name, Double salary,String dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept=dept;
	}
	
	@Override
	public String toString() {
		return "["+this.id+","+this.name+","+this.salary+","+this.dept+"]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}
