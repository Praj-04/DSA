package com.week7.assignment.arrays1;

import java.util.Arrays;

public class ChocolateDistribution {

	public static void main(String[] args) {
//int[] arr = {7, 3, 2, 4, 9, 12, 56};
//		int m=3;
int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
int m=5;
Arrays.sort(arr);

System.out.println(findMinDiff(arr, m));
	}
	
	public static int findMinDiff(int[] arr, int m)
    {
		int minDiff=Integer.MAX_VALUE;
		int diff=0;
		for(int i=0;i<=arr.length-m;i++) {
			diff=arr[i+m-1]-arr[i];
			minDiff=Math.min(minDiff, diff);
		}
		
		return minDiff;
      
    }

}
