package com.tka;

import java.util.Scanner;

public class SortTheArray {
	
	/* given the array of size N contaning only 0s, 1s , 2s; sort the array in ascending order
	 * e.g N= 6 
	 * arr[] = {0 1  0 2 0 2}
	 * Output = 0 0 0 1 2 2
	 * 
	 * Dutch National Flag Algorithm
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of an Array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter " + n + " elements (only 0s, 1s, and 2s):");
		for(int i =0; i < n ;i++) {
			arr[i] = sc.nextInt();
		}
		
		// Dutch National Flag Algorithm
        int low = 0;
        int mid = 0;
        int high = n - 1;
        
        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
	}
}
