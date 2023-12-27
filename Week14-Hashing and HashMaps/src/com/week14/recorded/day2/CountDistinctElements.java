package com.week14.recorded.day2;

import java.util.HashSet;

public class CountDistinctElements {

	public static void main(String[] args) {
int a[]= {10,20,20,30,10,40,30};
System.out.println(countDistinctElements(a));
		
	}
	
	static int countDistinctElements(int a[]) {
		HashSet<Integer> set= new HashSet<>();
		for(int e:a) {
			set.add(e);
		}
		return set.size();
		
		
	}

}
