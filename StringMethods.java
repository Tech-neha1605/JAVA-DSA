package com.tka;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String str = "Neha Patil";
		
		System.out.println("Given String is = " + str);
		
		//length of a string
		int length = str.length();
		System.out.println("Length of a String : " + " " + length);
		
		//char at index 
		char firstchar = str.charAt(1);
		System.out.println("FirstChar of string : " + " " + firstchar);
		
		//substring(int beginIndex )
		String substring = str.substring(7);
		System.out.println("Char at 7th index : " + " " +substring);
		
		//substring( 0th index to 4rth index)
		String rangeString = str.substring(0, 6);
		System.out.println("char between range of index 0  and 6 : " + " " + rangeString);
		
		//concat string 
		String concatstr = str.concat("Patil");
		System.out.println("Concatinated String is  : " + concatstr);
		
		//uppercase 
		String upper = str.toUpperCase();
		System.out.println("UpperCase String : " + " " + upper);
		
		//lowercase 
		 String lower  = str.toLowerCase();
		 System.out.println("LowerCase : " + " " + lower);
		 
		 //replacechar 
		 String replace = str.replace('N', 'M');
		 System.out.println("Replace char String : " + " " + replace);
	}

}
