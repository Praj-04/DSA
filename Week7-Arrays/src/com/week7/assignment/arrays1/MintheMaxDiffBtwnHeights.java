package com.week7.assignment.arrays1;

import java.util.Arrays;

public class MintheMaxDiffBtwnHeights {

	public static void main(String[] args) {

		int[] a = {1,5,7,10};
		int k=2;
		System.out.println(getMinDiff(a,k));
		
	}

	private static int getMinDiff(int[] a, int k) {
		int n=a.length;
		if(n==1) return 0;
		Arrays.sort(a);
		int diff= a[n-1]-a[0];
		
		int min,max;
		for(int i=1;i<n;i++) {
			if(a[i]-k<0) continue;
			max= Math.max(a[i-1]+k, a[n-1]-k);
			min=Math.min(a[i]-k, a[0]+k);
			diff=Math.min(diff, max-min);
		}
		return diff;
	}

}
