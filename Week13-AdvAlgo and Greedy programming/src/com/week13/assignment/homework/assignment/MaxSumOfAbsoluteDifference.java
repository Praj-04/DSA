package com.week13.assignment.homework.assignment;

import java.util.Arrays;

public class MaxSumOfAbsoluteDifference {

	public static void main(String[] args) {
int a[]= {	1,2,4,8	};
int n= a.length;
System.out.println(maxDiffernce(a, n));
	}

	public static int maxDiffernce(int a[],int n) {
		int ans=0;
		int left=0;
		int right=a.length-1;
		boolean flip=true;
		
		while(left<right) {
			ans+=Math.abs(a[left]-a[right]);
			if(flip) {
				left++;
			}else {
				right--;
			}
			flip=!flip;
		}
		ans+=Math.abs(a[a.length/2]-a[0]);
		
		return ans;
	}
}
