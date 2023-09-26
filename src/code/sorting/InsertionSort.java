package code.sorting;

public class InsertionSort {

	public static void main(String[] args) {

		int arr[] = {5,2,4,1,6,8,9,10};
		sort(arr);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			
			int key = arr[i];
			int j =i-1;
			
			while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
			arr[j + 1] = key;
		}
	}

}
