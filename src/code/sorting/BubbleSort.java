package code.sorting;

public class BubbleSort {

	//Swapping element
	
	public static void main(String[] args) {
		int arr[] = {5,2,4,1,6,8,9,10};
		sort(arr);
		
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	public static void sort(int arr[]) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
}
