package com.tka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {
	
	public static void bucketSort(float[] nums) {
		
		int n = nums.length;
		
		//create bucketlist
		ArrayList<Float>[] buckets =new ArrayList[n];
		for(int i =0;i<n;i++) {
			buckets[i]=new ArrayList<>();
		}
		
		//Add element to the buckdet
		for(int i =0;i<n;i++) {
			int bucketIndex=(int)(n*nums[i]);
			buckets[bucketIndex].add(nums[i]);
		}
		
		//sort individual buckets
		for(int i =0;i<n;i++) {
			Collections.sort(buckets[i]);
		}
		
		//merge sorted bukets into the array
		int index=0;
		for(int i =0;i<n;i++) {
			for(float num: buckets[i]) {
				nums[index++] =num;
			}
		}
	}
	
	public static void main(String[] args) {
		float[] nums= {0.25F,0.13F,0.58F,1.23F,5.21F,4.10F,0.001F};
		System.out.println("Before Sorting :");
		for(float num: nums) {
			System.out.println(num + " ");
		}
		
		System.out.println();
		bucketSort(nums);
		
		
		System.out.println("Before Sorting :");
		for(float num: nums) {
			System.out.println(num + " ");
		}
		System.out.println();
	}

}
