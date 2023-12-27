package com.week7.assignment.arrays1;

import java.util.Arrays;

public class maxSortedChunks2 {

	public static void main(String[] args) {
//int[] a = {6,3,5,8,7,12,9};
		int[] a = { 3, 1, 4, 6, 5, 8, 7 };

	

		int[] left = new int[a.length];
		int right[] = new int[a.length];
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			max = Math.max(a[i], max);
			left[i] = max;

		}
		

		int min = Integer.MAX_VALUE;
		for (int j = a.length - 1; j >= 0; j--) {
			min = Math.min(min, a[j]);
			right[j] = min;
		}

		int chunk = 0;
		

	for(int i=0;i<left.length-1;i++) {
		if(left[i]<=right[i+1]) {
			chunk++;
		}
		
	}
	System.out.println(chunk+1);
		
		
	}
	
	

}
