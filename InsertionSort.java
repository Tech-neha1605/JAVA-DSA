package com.tka;

import java.util.Arrays;

public class InsertionSort {
	
	public static void InsertionSortExample(int[] array) {
		int n = array.length;
		for(int i = 0;i<n;i++) {
			int key = array[i];
			int j =i-1; //initialize veriable j to track the position in the sorted path
		//comapre the key with the element in the sorted path and shift thenthemm to the right if they are graeter
			while(j>=0 &&array[j]>key){
				array[j+1]=array[j]; //shiftinng element to theright 
				j--;
			}
			array[j+1]=key;// play the key in the sorted part
		}
	}
	
	public static void main(String[] args) {
		
		int[] numbers = {5,8,6,1,7,9,10};
		System.out.println("Before Sorting" + Arrays.toString(numbers));
		InsertionSortExample(numbers);
		
		System.out.println("After sorting " + Arrays.toString(numbers));
		
	}

}
