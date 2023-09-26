package code.scenariobased;

public class PrintAsperGivenPattern {

	/* Pring given pattern for number of iterartion give
	 * 
	 * 1234 
	 * 5612 
	 * 3456 
	 * 1234 
	 * 5612
	 */
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int col =4;
		int row =5;
		
		int count=0;
		for (int i = 1; i <=(col*row) ; i++) {
			System.out.print(arr[count++]);
			if(count==arr.length) count=0;
			if(i%col==0)System.out.println("");
		}
	}
}
