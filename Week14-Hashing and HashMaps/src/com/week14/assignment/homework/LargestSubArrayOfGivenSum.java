package com.week14.assignment.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayOfGivenSum {

	public static void main(String[] args) {
		int[] a = {15,-2,2,-8,1,7,10,23};
		int sum = 0;
		System.out.println(maxLen(a, a.length, sum));
		

	}

	public static int maxLen(int[] arr, int n,int sum) {

		Map<Integer, Integer> map = new HashMap<>();
		int start = 0;
		int end = -1;
		int cs = 0;
		int largest=Integer.MIN_VALUE;
		int length=0;
		
				for (int i = 0; i < arr.length; i++) {
			cs += arr[i];
			if(cs==0) {
				start=0;
				end=i;
				 length=end-start;
				largest=Math.max(largest, length);
			}
			
			if (map.containsKey(cs)) {
				start=map.get(cs);
				end=i;
				 length=end-start;
					largest=Math.max(largest, length);
			} else {
				map.put(cs, i);
			}
			
			
				}
		return largest;

}
}
