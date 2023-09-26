package code.sorting;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = {5,2,4,1,6,8,9,10};
		sort(arr);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			
			 // Find the minimum element in unsorted array
			int min_idx=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}
			
			// Swap the found minimum element with the first
            // element 
			int temp = arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
		}
	}

}
