package com.week7.assignment.arrays1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SumOfMinMax {

	public static void main(String[] args) {
		List<Long> nums = new ArrayList<>();
		nums.add(-10l);
		nums.add(2l);
		nums.add(4l);
		nums.add(5l);
		nums.add(6l);
		Collections.sort(nums);
		System.out.println(nums);
	
	System.out.println(sumMaxMin(nums));

	}
	
	 public static long sumMaxMin(List<Long> nums) {
		 
	     return nums.get(nums.size()-1)+nums.get(0);

	    
	  }

}
