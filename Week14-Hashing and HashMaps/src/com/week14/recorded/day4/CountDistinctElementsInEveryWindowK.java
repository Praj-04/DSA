package com.week14.recorded.day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementsInEveryWindowK  {

	public static void main(String[] args) {
int a[]= {1,2,1,3,4,2,3};

int ans[]= uniqueElements(a, 4);
System.out.println(Arrays.toString(ans));
	}
	
	public static int[] uniqueElements(int a[],int k) {
		int n= a.length;
		int ans[]= new int[n-k+1]; 
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<k;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		
		
		for(int i=k;i<n;i++) {
			
			ans[i-k]=map.size();
			
			int left=i-k;
			int right=i;
			
			int freqLeft=map.get(a[left]);
			
			if(freqLeft==1) {
				map.remove(a[left]);
			}else {
				map.put(a[left], freqLeft-1);
			}
			
			if(map.containsKey(a[right])) {
				map.put(a[right], map.get(a[right])+1);
			}else {
				map.put(a[right], 1);
			}
			
		}
		
		ans[n-k]=map.size();
		return ans;
		
		
		
		
	}

}
