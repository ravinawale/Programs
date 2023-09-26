package code.seraching;

import java.util.Arrays;

public class BinarySearch {
	
    public static void main(String args[]) {
    	
    	int a1 [] = {60,1,50,80,10,20,30,40,7};
    	
    	int first=0;
    	int last=a1.length;

    	sort(a1);
    	
    	Arrays.sort(a1);
    	
    	for (int i : a1) {
			System.out.print(i+" ");
		}
    	
    	System.out.println("");
    	
    	bi_search(a1,7,first,last);
    	int index = bi_search_recc(a1,7,first,last);
    	
    	if(index==-1) {
    		System.out.println("Not found");
    	}else {
    		System.out.println("Key found at index : "+index);
    	}
	}
    
    public static void sort(int arr[]) {
    	int temp;
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = i+1; j < arr.length; j++) {
    			 if(arr[i]>arr[j]) {
    				 temp=arr[i];
    				 arr[i]=arr[j];
    				 arr[j]=temp;
    			 }
			}
		}
    }
    
	public static void bi_search(int arr[],int key,int first,int last) {
		int mid = (first+last)/2;
		
		while(first <=last) {
			if(arr[mid]<key) {
				first=mid+1;
			}else if(arr[mid]==key) {
				System.out.println("Key found at index : "+mid);
				break;
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		
		if(first>last) {
			System.out.println("Key not found");
		}
	}
	
	public static int bi_search_recc(int arr[],int key,int first,int last) {
		if(last>=first) {
			int mid = (first+last)/2;
			System.out.println("mid : "+mid+" first : "+first+" last :"+last);
			
			if(arr[mid]==key) {
			   System.out.println("arr[mid]==key");
			   return mid;
			}
			
			if(arr[mid]<key) {
			   return bi_search_recc(arr,key,mid+1,last);
			}else {
			   return bi_search_recc(arr,key,first,mid-1);
			}
		}
		return -1;
	}
	
}
