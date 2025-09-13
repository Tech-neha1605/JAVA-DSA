package com.tka;

import java.util.ArrayList;

public class DynamicArrayExample {
	
	public static void main(String[] args) {
		
		
		//create arraylist to store numbers
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		//to add element in an arraylist 
		
		num.add(10);
		num.add(60);
		num.add(50);
		num.add(80);
		num.add(40);
		
		//access element in an arraylist
		System.out.println(num.get(0));
		System.out.println(num.get(1));
		System.out.println(num.get(2));
		System.out.println(num.get(3));
		System.out.println(num.get(4));
		
		//update value in arraylist
		num.set(3, 25);
		
		//delete value in arraylist 
		num.remove(4);
		
		//size of an arraylist 
		int size =num.size();
		System.out.println("Size of an array = " + size);
		
		//loop through the arraylist 
		for(int i =0;i<num.size();i++) {
			System.out.println("Element at index " + i+" = " + num.get(i));
		}
		
	}

}
