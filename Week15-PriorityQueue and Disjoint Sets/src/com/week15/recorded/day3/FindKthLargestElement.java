package com.week15.recorded.day3;

import java.util.PriorityQueue;

public class FindKthLargestElement {

	public static void main(String[] args) {
 int[] a= {4,1,3,6,3,7};
 int k=2;
 
 System.out.println(findKthLargest(a,k));
	}

	private static int findKthLargest(int[] a, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int e:a) {
			pq.add(e);
		
		if(pq.size()>k) {
		pq.poll();
		}
		}
		return pq.peek();
		
	}

}
