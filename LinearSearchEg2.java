package com.tka;

import java.util.Scanner;

public class LinearSearchEg2 {
	
	public static void main(String[] args) {
		
		int []array = {1,5,9,7,8};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be Searched");
		int target = sc.nextInt();
		
		int index = linearSearch(array , target);
		if(index!= -1) {
			System.out.println("Element" + target + "Found at Index" + index);
		}else {
			System.out.println("Element" + target + "Not Found at Index" + index ); 
		}
	}
	
	public static int linearSearch(int [] array , int target) {
		for(int i =0 ; i<=array.length ; i++) {
			if(array[i] ==target) {
				return i;  //element found
			}
			
		}
		return -1;
	}

}
