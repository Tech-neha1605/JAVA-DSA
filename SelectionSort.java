package com.tka;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] nums= {5,8,3,6,9,10};
		bubbleSort(nums);
		
		System.out.println("Sorted Array : ");
		for(int num: nums) {
			System.out.println(num + " ");
		}
	}

	private static void bubbleSort(int[] nums) {
		// TODO Auto-generated method stub
		int n=nums.length;
		for(int i =0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(nums[j]<nums[minIndex]){
					minIndex=j;
				}
			}
			//swap the minimum elementwith the current element
			int temp=nums[i];
			nums[i] =nums[minIndex];
			nums[minIndex]=temp;
		}
		
		
	}

}
