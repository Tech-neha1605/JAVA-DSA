package com.tka;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		int [][] matrix = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		
		//accesing the element 
		System.out.println("Element at Matrix[0][1]" + matrix[0][1]);
		
		//modifying the element 
		matrix[1][3]=9;
		System.out.println(" Updated Element at [1][3]" + matrix[1][3]);
		
		System.out.println("2 D Array:");
		for(int i=0;i<matrix.length;i++) {
			for(int j =0;j<matrix[i].length;j++) {
				System.out.println(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
