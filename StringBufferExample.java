package com.tka;

public class StringBufferExample {
	
public static void main(String[] args) {
		
		StringBuffer stringBuffer = new StringBuffer("Hello");
		
		//append String str
		stringBuffer.append("World !") ;
		System.out.println(stringBuffer.toString());
		
		//insert 
		stringBuffer.insert(5, "Awesom");
		System.out.println(stringBuffer.toString());
		
		//delete
		stringBuffer.delete(5, 11);
		System.out.println(stringBuffer.toString());
		
		
		
		
	}

}
