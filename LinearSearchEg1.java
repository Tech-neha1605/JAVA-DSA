package com.tka;

public class LinearSearchEg1 {
	
	public static void main(String[] args) {
		
		int []array = {1,5,9,7,8};
		int target = 9;
		
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
		return target;
	}

}
