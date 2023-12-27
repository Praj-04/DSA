package com.week14.recorded.day3;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {

	public static void main(String[] args) {
int a[]= {1,4,-5,2,3,-3,0};
System.out.println(countSubArraysWithZeroSum(a));
	}
	
	
	static int countSubArraysWithZeroSum(int a[]) {
		Set<Integer> set=new HashSet<>();
		int count=0;
		int cs=0;
		set.add(0);
		for(int e:a) {
			cs+=e;
			 if(set.contains(cs)) {
				count++;
			}else {
				set.add(cs);
				
			}
		}
		return count;
	}

}
