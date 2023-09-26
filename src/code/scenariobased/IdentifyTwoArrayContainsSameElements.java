package code.scenariobased;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IdentifyTwoArrayContainsSameElements {

	public static void main(String[] args) {
		Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		System.out.println(sameElements(a1, a2));
	}

	static boolean sameElements(Object[] array1, Object[] array2) {
		Set<Object> uniqueSet1 = new HashSet<>(Arrays.asList(array1));
		Set<Object> uniqueSet2 = new HashSet<>(Arrays.asList(array2));
		
		// if size is different, means there will be a mismatch
		if (uniqueSet1.size() != uniqueSet2.size()) return false;
		
		for (Object ele : uniqueSet1) {
			if (!uniqueSet2.contains(ele)) return false;
		}
		return true;
	}
}