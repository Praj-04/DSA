package com.week7.recorded.arrays4;

import java.util.Arrays;

public class MinimumSumSubArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 5, 6, 7, 2 };

		 int k = 7;
		 
	int minSubArrayLength=	 minSubArray(a,k);
System.out.println(minSubArrayLength);
	}

	private static int minSubArray(int[] a, int k) {
int l=0,r=0;
int curSum=0;
int minLength=Integer.MAX_VALUE; 
int n= a.length;

while(r<n) {
	curSum += a[r];
	
while(curSum>=k) {
	minLength=Math.min(minLength, r-l+1); // r-l+1 will gie the length of window between pointer
	curSum -= a[l];
	l++;
	
}
r++;
	
}
if(minLength == Integer.MAX_VALUE) {
	minLength =0;
}

return minLength;
	}
}
