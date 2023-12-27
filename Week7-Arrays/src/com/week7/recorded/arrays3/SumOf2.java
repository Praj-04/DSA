package com.week7.recorded.arrays3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOf2 {

	public static void main(String[] args) {
		int a[]= {4,2,2,-1,-3,0,1,2,2,3};
		int sum=4;
		List<List<Integer>> ans= twoSum(a,4,0);
		System.out.println(ans);
	}

	static List<List<Integer>> twoSum(int a[], int sum, int startFrom) {
		int l = startFrom;
		int r = a.length - 1;
		Arrays.sort(a);
		List<List<Integer>> answer = new ArrayList<>();

		while (l < r) {
			
		//this part of code is used to avoid duplicate entries for a sum  	
		/*	if(l>startFrom && a[l]==a[l-1]) {   
				l++;
				continue;
			}
			if(r<a.length-1 && a[r]==a[r+1]) {
				r--;
				continue;
			}
			*/
			
			if (a[l] + a[r] > sum) {
				r--;
			} else if (a[l] + a[r] < sum) {
				l++;
			} else {
				List<Integer> temp = new ArrayList<>();
				temp.add(a[l]);
				temp.add(a[r]);
				answer.add(temp);
				l++;
				r--;
			}
		}
		return answer;

	}

}
