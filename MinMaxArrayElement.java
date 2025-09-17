package com.tka;

import java.util.Scanner;

public class MinMaxArrayElement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array : ");
		int n  = sc.nextInt();
		
		//input array element 
		int[] arr =new int[n];
		System.out.println("Enter Array : "+ n + "elements");
		for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		
		
		//initialize min max with 1st element
		int min = arr[0];
		int max = arr[0];
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		// print results
        System.out.println("Minimum element in array = " + min);
        System.out.println("Maximum element in array = " + max);
		
        sc.close();
	}

}
