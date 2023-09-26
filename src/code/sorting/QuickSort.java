package code.sorting;

public class QuickSort {

	public static void main(String[] args) {
			
		int arr[] = {5,2,4,1,6,8,9,10};
		int n = arr.length;
        quickSort(arr, 0, n - 1);
        
        for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	static void quickSort(int arr[],int low , int high) {
		if(low < high) {
			int pi = partition(arr,low,high);
			//Left and Right of Pivot
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	
	static int partition(int arr[],int low, int high) {
		
		int pivot= arr[high];
		int i = low-1;
		
		for (int j = low; j < high; j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		
		return i+1;
	}
	
	static void swap(int arr[], int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
