package com.tka;

public class QuickSort {
	
	public static void swap(int[] arr , int i , int j ) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]=temp;
		
	}
	
	public static int partition(int[] arr , int start , int end) {
		int pivot =arr[end];
		int pIndex =start;
		for(int i=start; i<end; i++) {
			if(arr[i] < pivot) {
				swap(arr,i,pIndex);
				pIndex++;
			}
		}
		
		swap(arr , end , pIndex); //putn the pivot element in the currrent position
		return pIndex;
	}
	
	public static void quicksort(int[] arr , int start , int end ) {
		if(start<end) {
			int pIndex=partition(arr, start ,end);
			
			
			quicksort(arr , start , pIndex-1);
			quicksort(arr , pIndex+1 ,end);
		}
	}
	
	public static void display(int[] arr) {
		System.out.println("Sorted array is : ");
		for(int num :arr) {
			System.out.println(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr= {14,56,23,89,74,100,59,156,41};
		int size = arr.length;
		quicksort(arr, 0, size-1);
		display(arr);
	}

}
