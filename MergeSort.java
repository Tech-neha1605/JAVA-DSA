package com.tka;

import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		// Copy left half
		for (int i = 0; i < n1; i++) {
			L[i] = arr[left + i];
		}

		// Copy right half
		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}

		int i = 0, j = 0, k = left;

		// Merge two halves
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[]
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[]
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	
	public static void display(int[] arr) {
		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr = {8, 6, 9, 4, 3, 5, 6, 10};
		int n = arr.length;
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		mergeSort(arr, 0, n - 1);
		display(arr);
	}
}
