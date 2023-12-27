package com.dsa.kk.recursion;

public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 8, 10, 20, 300 };
		int target = 4;
		int e = arr.length - 1;
		int s = 0;
		System.out.println(search(arr, target, e, s));

	}

	static int search(int[] arr, int target, int e, int s) {
		if (s > e) {
			return -1;
		}
		int m= s +(e-s)/2; 
		if(arr[m]==target) {
			return m;
		}
		
		if(target<arr[m]) {
			return search(arr,target,m-1,s);
				}
		return search(arr,target,e,m+1);	}
}
