package code.scenariobased;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class IdentifyIfTwoListContainsSameElement {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(1);
		
		System.out.println(hasSameElements(list,list2));
	}
	
	public static boolean hasSameElements(List<Integer> l1, List<Integer> l2 ) {
		
		Set<Integer> s1 = new HashSet<Integer>(l1);
		Set<Integer> s2 = new HashSet<Integer>(l2);
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.size() != s2.size()) return false;
		
		for(Integer ele : s1) {
			if(!s2.contains(ele)) return false;
		}
		return true;
	}
}
