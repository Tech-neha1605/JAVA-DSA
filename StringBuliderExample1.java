package com.tka;

public class StringBuliderExample1 {
	
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("Hello");
		
		//append String str
		stringBuilder.append("World !") ;
		System.out.println(stringBuilder.toString());
		
		//insert 
		stringBuilder.insert(5, "Awesom");
		System.out.println(stringBuilder.toString());
		
		//delete
		stringBuilder.delete(5, 11);
		System.out.println(stringBuilder.toString());
		
		
		
		
	}

}
