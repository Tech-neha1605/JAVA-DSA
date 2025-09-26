package com.tka;


//find occurance of target integer in the array using linear search
public class LinearSearchOccurance {
	
	public static void main(String[] args) {
		
		int[] arr = {2,3,5,9,7 , 7 , 8 , 7 , 9 , 2 , 5 ,2};
		int target = 2;
		
		int count = countOccurances(arr , target);
		System.out.println("Occurance of   " + target + "  in the array  " + count );
		
	}
	
	private static int countOccurances(int[] arr, int target) {
		int count = 0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		return count;
	}

}
