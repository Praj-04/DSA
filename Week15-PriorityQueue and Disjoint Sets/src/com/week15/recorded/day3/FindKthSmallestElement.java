package com.week15.recorded.day3;

import java.util.PriorityQueue;

public class FindKthSmallestElement {

	public static void main(String[] args) {
 int[] a= {4,1,3,6,2,7};
 int k=2;
 
 System.out.println(findKthLargest(a,k));
	}

	private static int findKthLargest(int[] a, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((p,q)->q-p);
		
		for(int e:a) {
			pq.add(e);
		
		if(pq.size()>k) {
		pq.poll();
		}
		}
		return pq.peek();
		
	}

}
