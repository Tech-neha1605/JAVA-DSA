package com.tka;

public class HeterogeneousElements {
	
	public static void main(String[] args) {
		//heterogeneous elements in array 
		Object[] data = new Object[5];
		data[0]= "Neha";
		data[1] = true ;
		data[2] = 3.12;
		data[3] = 'P' ;
		data[4] = 1233;
		
		//access elements in an Array
		for(int i = 0 ; i<data.length;i++) {
			System.out.println("Heterogeneous Elements at Index  " + i + " : " + data[i]);
		}
		
	}

}
