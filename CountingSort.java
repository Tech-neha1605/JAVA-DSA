package com.tka;

public class CountingSort {
	
	public static void main(String[] args) {
		
		int[] nums= {20,51,48,69,10,35,54};
		countingSort(nums);
		System.out.println("Sorted Array Is : ");
		for(int num: nums) {
			System.out.println(num + " ");
		}	
	}
	private static void countingSort(int[] nums) {
		int n = nums.length;
		//find the maximum element in an array
		int max=nums[0];for(int i=1;i<n;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		
		//create an array to store the count of each element 
		int[] count =new int[max+1];
		
		//store the count of each element in the array 
		for(int i =0;i<n;i++) {
			count[nums[i]]++;
		}
		
		//modify the count array to containthe actual postionof each element in an array
		for(int i =1;i<=max;i++) {
			count[i]=count[i]+count[i-1];
		}
		
		//create a temporary array to store the sorted output
		int[] output =new int[n];
		
		//build sorted array by placing element in correct position
		for(int i=n-1;i>0;i--) {
			output[count[nums[i]]-1] =nums[i];
			count[nums[i]]--;
		}
		
		//copy the sorted element from the element to the original array
		for(int i =0;i<n;i++) {
			nums[i]=output[i];
		}
	}

}
