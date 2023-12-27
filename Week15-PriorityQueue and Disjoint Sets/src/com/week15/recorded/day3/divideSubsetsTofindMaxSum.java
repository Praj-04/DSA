package com.week15.recorded.day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class divideSubsetsTofindMaxSum {

	public static void main(String[] args) {
//Integer[] a= {1,7,9,2,12,3,3};
//int m=3;
		
		Integer[] a= {12,9,7,3,3,2,1};
		int m=4;
System.out.println(findMaxSum(a, m));
	}
	
	public static int findMaxSum(Integer a[],int m) {
		int n=a.length;
		Arrays.sort(a,Collections.reverseOrder());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//fill with 0
		for(int i=0;i<m;i++) {
			pq.add(0);
		}
		
		for(int e:a) {
			int smallest=pq.poll() ;		
		pq.add(smallest+e);
			}
		
		for(int i=0;i<m-1;i++) {
			pq.poll();
		}
		return pq.poll();
		
	}

}
