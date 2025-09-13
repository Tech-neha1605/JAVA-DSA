package com.tka;

public class ArrayDeclaration {
	
	public static void main(String[] args) {
		
		int[] numbers;
		numbers = new int[5]; //declare an array 
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		//print an array 
		
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
