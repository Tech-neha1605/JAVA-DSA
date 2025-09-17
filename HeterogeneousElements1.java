package com.tka;

import java.util.ArrayList;

public class HeterogeneousElements1 {
	
	public static void main(String[] args) {
		
		ArrayList<Object> data = new ArrayList<>();
		
		data.add(0, "Megha");
		data.add(1, 123);
		data.add(2, 3.15);
		data.add(3, 'A');
		data.add(4, true);
		
		for(int i =0 ; i<data.size();i++) {
			System.out.println("ArrayList Element at Index  " + i +" = "+ data.get(i));
		}
	}

}
