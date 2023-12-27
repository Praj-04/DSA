package com.week14.assignment.homework;

import java.util.HashMap;
import java.util.Map;

public class LargestSubarrayWithZeroSumBhaiyaCode {

	public static void main(String[] args) {
		int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
		System.out.println(findLongest(arr));
	}

	public  static int findLongest(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int cs=0;
		int maxLength=0;
		map.put(0, -1);
		for(int i=0;i<arr.length;i++) {
			cs+=arr[i];
			if(map.containsKey(cs)) {
				int length= i - map.get(cs);
				maxLength=Math.max(maxLength,length);
			}else {
				map.put(cs, i);
			}
		}
		
		return maxLength;
	}

}
