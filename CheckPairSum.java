package com.tka;

public class CheckPairSum{
	
	//Check if pair with givem sum exixts in an array 
	
	/* Given Array A[] of n numbersand another number x ,the task is to check wheather or not there exist 
	  two elements in A[] who's sum is exactly x */
	
	
	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7};
		int x = 7 ;
		boolean isPairSum =false;
		
		for(int i =0 ; i< num.length-1;i++) {
			for(int j = 1 ;j< num.length;j++) {
				if(num[i]+num[j] ==7) {
					System.out.println("Pair Sum Found " + num[i] + "+" + num[j] + "=" + x);
					isPairSum =true;
				}
			}
		}
		
		if(!isPairSum) {
			System.out.println("No Pair Sum is Found");
		}
	}
	

}
