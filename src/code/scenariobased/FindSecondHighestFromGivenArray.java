package code.scenariobased;

public class FindSecondHighestFromGivenArray {

	public static void main(String args[]) {
		int arr[] = {4,5,16,12,2,3};
		System.out.println("second hightes => "+findSecondHighest(arr));
		
	}

	private static int findSecondHighest(int[] data) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
	
		for (int ele : data) {
			if (ele > highest) {
				secondHighest = highest;
				highest = ele;
			} else if (ele > secondHighest) {
				secondHighest = ele;
			}
		}
		return secondHighest;
	}

}