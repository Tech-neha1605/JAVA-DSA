package com.tka;

public class BubbleSort {
	
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
		int n= nums.length;
		for(int i=0;i<n-1;i++) {
			for(int j =0;j<n-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					//swap element
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
	}
	
	

}
