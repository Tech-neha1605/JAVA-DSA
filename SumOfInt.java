package com.tka;

import java.util.Scanner;

public class SumOfInt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array = ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements in an array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = 6;
        boolean found = false; // flag to check if pair exists

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) { // start j from i+1 to avoid duplicates
                if(arr[i] + arr[j] == target) {
                    System.out.println("Output = [" + i + ", " + j + "]");
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("No pair found");
        }
    }
}
