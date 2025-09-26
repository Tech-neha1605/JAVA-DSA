package com.tka;

public class MaximumElementLinearSearch {
	
	public static void main(String[] args) {
		
		int[] arr = {5,8,9,6,3,10,45};
		int max =findMaximumElement(arr);
		System.out.println("Maximum element in the array  =  " + max);
	
	}
	private static int findMaximumElement(int[]  max) {
		int max1 =max[0];
		for(int i =0 ; i<max.length ; i++) {
			if(max[i]>max1){
				max1=max[i];
			}
		}
		return max1;
				
	}

}
