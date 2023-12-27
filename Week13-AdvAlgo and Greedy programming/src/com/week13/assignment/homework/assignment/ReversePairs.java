package com.week13.assignment.homework.assignment;

import java.util.Arrays;

public class ReversePairs {

	public static void main(String[] args) {
		int[] arr = { 6, 0, 2, 2, 8, 3, 1 };
		System.out.println(reversePairs(arr));
	}

	public static int reversePairs(int[] nums) {
		int[] doubleValue = new int[nums.length];
		int count = 0;
		doubleValue[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			doubleValue[i] = nums[i] + nums[i];
		}
//		System.out.println(Arrays.toString(nums));
//		System.out.println(Arrays.toString(doubleValue));

		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < doubleValue.length; j++) {

				if (nums[i] > doubleValue[j]) {
//					System.out.println(nums[i] + " " + doubleValue[i]);
					count++;
//					System.out.println("count is " + count);
				}
			}
		}
		return count;
	}

}
