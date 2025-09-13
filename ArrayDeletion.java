package com.tka;

public class ArrayDeletion {
	
	public static void main(String[] args) {
		
		int[] num= {10,20,30,40,50};
		int indexDelete = 3;
		
		//shifting element to the left side 
		
		for(int i =indexDelete ; i<num.length-1 ; i++) {
			num[i] = num[i+1];
		}
		
		num[num.length-1]=0;
		
		for(int i = 0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}

}
