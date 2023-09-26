package code.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashCodeAndEqual {

	public static void main(String[] args) {

		List<EmployeeLocal> employees = 
				Arrays.asList(new EmployeeLocal(1,"ravi",5000),
							  new EmployeeLocal(2,"aarush",5000),
						      new EmployeeLocal(1,"ravi",6000),
						      new EmployeeLocal(2,"aarush",6000));
				
		Map<EmployeeLocal,Double> emp = employees.stream()
				 .collect(Collectors.toMap(e -> e, e -> e.salary,(e1,e2)-> e2,LinkedHashMap::new));
				 
		//System.out.println(employees);
		System.out.println(emp);
	}
}

class EmployeeLocal{
	
	int id;
	String name;
	double salary;
	
	public EmployeeLocal(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj==this) return true;
		if(obj instanceof EmployeeLocal) return true;
		if(obj==null) return false;
		
		EmployeeLocal emp = (EmployeeLocal)obj;
		if(emp.id==this.id && emp.name == this.name) return true;
		
		return super.equals(obj);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeLocal [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}