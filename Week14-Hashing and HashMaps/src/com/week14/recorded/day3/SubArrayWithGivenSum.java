package com.week14.recorded.day3;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3,5,3,2 };
		int k = 5;
		System.out.println(countSubArrayEqualsSum(nums, k));
	}

	private static int countSubArrayEqualsSum(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();
		int count = 0;

		int cs = 0;
		set.add(0);
		for (int i = 0; i < nums.length; i++) {
			cs += nums[i];
			 if (set.contains(cs - k)) {
				count++;
			}else {
			
				set.add(cs);
			}
		}
		return count;
	}

}
