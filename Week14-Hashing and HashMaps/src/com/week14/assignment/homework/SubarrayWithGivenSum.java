package com.week14.assignment.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 7, 5 };
		int sum = 12;
		ArrayList<Integer> ans = subarraySum(a, a.length, sum);
		System.out.println(ans);

	}

	public static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) {

		Map<Integer, Integer> map = new HashMap<>();
		int start = -1;
		int end = -1;
		int cs = 0;
		ArrayList<Integer> ans = new ArrayList<>();
				for (int i = 0; i < arr.length; i++) {
			cs += arr[i];
			if(cs-sum==0) {
				start=0;
				end=i;
				ans.add(start);
				ans.add(end);
				return ans;
			}
			
			if (map.containsKey(cs - sum)) {
				start=map.get(cs-sum)+1;
				end=i+1;
				ans.add(start);
				ans.add(end);
				return ans;
			} else {
				map.put(cs, i+1);
			}
			
			
				}
		return ans;

	}
}
