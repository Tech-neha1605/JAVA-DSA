package com.tka;

public class FindKthElement {
	
	public static void main(String[] args) {
		int[] arr= {1,4,8,6,4};
		int[] arr2= {3,9,10,15};
		int k =5;
		
		int kthElement = findkthelement(arr,arr2,k);
		
		System.out.println("The" + " " + k + "th element of the merged sorted array is = " + kthElement);
	}

	private static int findkthelement(int[] arr, int[] arr2 ,int k) {
		int N=arr.length;
		int M =arr2.length;
		
		
		int i =0;
		int j=0;
		int count =0;
		
		while(i<N && j<M) {
			if(arr[i]<arr2[j]) {
				count++;
				if(count==k) {
					return arr[i];
				}
				i++;
			}else {
				count++;
				if(count==k) {
					return arr2[j];
				}
				j++;
			}
		}
		while(i<N && count<k) {
			count++;
			if(count==k) {
				return arr[i];
			}
			j++;
		}	
		return -1;
	}
	

}
