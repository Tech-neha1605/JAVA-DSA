package com.tka;

import java.util.ArrayList;

public class ArrayExample2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> Fruits = new ArrayList<>();
		
		Fruits.add(0, "Apple");
		Fruits.add(1, "Mango");
		Fruits.add(2, "Banana");
		Fruits.add(3, "Orange");
		Fruits.add(4, "Pineaaple");
		
		//print the arraylist 
		
		System.out.println("Arraylist Of Fruits : " + Fruits);
		
		
		//get element 
		String Fruit= Fruits.get(2);
		System.out.println("Element at index 2 : " + Fruit);
		
		//set element 
		System.out.println(Fruits.set(2, "Strawberry"));
		
		//check if Mango is in arraylist or not
		boolean contMango = Fruits.contains("Mango");
		System.out.println("is Mango in arrylist ?"+" = " + contMango);
		
		//remove element at  index --
		String removeFruit =  Fruits.remove(4);
		System.out.println("Removed Fruits : " + removeFruit);
		
		//print updated arraylist
		System.out.println("Updated ArrayList : " + Fruits);
		
		//check if arrayList is empty or not 
		boolean isEmpty = Fruits.isEmpty();
		System.out.println("ArrayList is Empty ?? "+"=" + " "+ isEmpty);
		
		//size of an array 
		System.out.println("Size of an ArrayList : " + Fruits.size());
	}

}
