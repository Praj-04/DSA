package com.week7.recorded.arrays2;

import java.util.*;
public class MinimumDifference {

	public static void main(String[] args) {

		int[]  a = {12,3,9,8,2,11};
		
		List<List<Integer>> ans= new ArrayList<>();
		
	ans	= minDiffernce(a,ans);
	System.out.println(ans);
		
	}

	private static List<List<Integer>> minDiffernce(int[] a,List<List<Integer>> ans) {

		Arrays.sort(a);
		int n= a.length;
		int minDiff = Integer.MAX_VALUE;
		
		for(int i=1;i<n;i++) {
			minDiff = Math.min(minDiff, a[i]-a[i-1]);
		}
		
		for(int i=1;i<n;i++) {
			if(a[i]-a[i-1]==minDiff)
			{
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(a[i-1]);
			temp.add(a[i]);
			ans.add(temp);
			
			}
			}
		
		return ans;
	}

}
