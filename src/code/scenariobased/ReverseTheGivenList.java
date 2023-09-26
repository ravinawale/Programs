package code.scenariobased;

import java.util.LinkedList;

public class ReverseTheGivenList {
	
	public static void main(String args[]) {
		
		LinkedList<Integer> srcLst = new LinkedList<>();
		srcLst.add(1);
		srcLst.add(2);
		srcLst.add(3);

		System.out.println(srcLst);

		LinkedList<Integer> reversedList = new LinkedList<>();
		srcLst.descendingIterator().forEachRemaining(reversedList::add);

		System.out.println(reversedList);
	}
}
