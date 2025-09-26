package com.tka;

public class LinearSearchLaastOccurance {
	
	public static void main(String[] args) {
		
		int[] arr = {4,5,6,8,9};
		
		int target = 0;
		
		int index = findLastOccurance(arr , target);
		
		if(index!= -1) {
			
			System.out.println("last occurance of  " + target + "Found at Index  " + index);
		}
		else {
			System.out.println("Last Occurnace is not found at index  " + index);
		}
	}
	
	private static int findLastOccurance(int[] arr , int target) {
		
		int index=-1;
		for(int i =0 ;i< arr.length;i++) {
			if(arr[i]==target) {
				index=i;
			}
		}
		return index;
	}

}
