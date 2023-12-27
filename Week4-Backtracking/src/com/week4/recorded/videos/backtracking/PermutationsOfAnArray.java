package com.week4.recorded.videos.backtracking;

import java.util.ArrayList;

public class PermutationsOfAnArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		ArrayList<int[]> ans = new ArrayList<>();
		permutate(a, 0, a.length - 1,ans);
		
		
		System.out.println("Printing the array");
		for(int[] arr:ans) {
			printArray(arr);
		}
		
	}

	private static void permutate(int[] a, int l, int r,ArrayList<int[]> ans) {

		if (l == r) {
			printArray(a);
			int[] b = new int[a.length];
			for(int i=0;i<a.length;i++) {
				b[i]=a[i];
			}
			ans.add(b);
			return;
		}
		
		for(int i=l;i<=r;i++) {
			swap(a,i,l);
			permutate(a, l+1, r,ans);
			swap(a,i,l);
		}

	}
	
	

	private static void swap(int[] a, int i, int l) {
int temp=a[i];
a[i]=a[l];
a[l]=temp;
	}

	private static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
	}

}
