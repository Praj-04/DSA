package com.week14.recorded.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSumUsingHash {

	public static void main(String[] args) {
int[] a= {1,3,-3,11,2,2};
int x= 0 ;

System.out.println(twoSum(a, 0));
int answer[] = twoSumIndices(a, x);
for(int e:answer) {
	System.out.print(e + " ");
}
	}

	static boolean twoSum(int a[],int x) {
		Set<Integer> set= new HashSet<>();
		for(int e:a) {
			if(set.contains(x-e)) {
				return true;
			}
			else {
				set.add(e);
			}
		}
		return false;
	}
	
	
	static int[] twoSumIndices(int a[],int x) {
		Map<Integer,Integer> map=new HashMap<>();
		int ans[]= {-1,-1};
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(x-a[i])) {
				ans[0]=map.get(x-a[i]);
				ans[1]=i;
				return ans;
			}else {
				map.putIfAbsent(a[i], i);
			}
		}
		return ans;
		
	}
	
}
