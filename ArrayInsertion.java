package com.tka;

public class ArrayInsertion {
	public static void main(String[] args) {
		
		int[] num = {10,2030,40,50};
		int insertIndex = 2;
		int insertValue = 25;
		
		//shifting element to the right 
		
		for(int i =num.length-1;i>insertIndex;i--) {
			num[i]=num[i-1];
		}
		
		//insert value at giben index
		
		num[insertIndex]=insertValue;
		
		//print updated array 
		
		for(int i = 0;i<=num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
