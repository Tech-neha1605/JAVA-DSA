package com.tka;

public class ArrayTraversal {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		String[] names = {"Neha", "Pratik" , "Vaibhav"};
		
		System.out.println("Number Array:");
		for(int i =0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("Names Array:");
		for(int i =0;i<names.length;i++) {
			System.out.println(names[i]);
		}
	}

}
