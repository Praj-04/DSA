package com.week10.recorded.queue3;

import java.util.ArrayDeque;

public class SlidingWindowMax {

	public static void main(String[] args) {
//		int[] a = {1,2,3,1,4,5,2,3,6};
		int[] a = {2,3,1,4,5,3,2,1,4};
		int[] ans = slidingWindowMaximumHelper(a, 3);
		
for(int e:ans) {
	System.out.print(e + " ");
	
}
	}
	
	
	public static int[] slidingWindowMaximumHelper(int a[],int k) {
		ArrayDeque<Integer> dq= new ArrayDeque<>();
		int i=0;
		while(i<k) {
			while(!dq.isEmpty() && dq.getLast() < a[i]) {
				dq.pollLast();
				
			}
			dq.offerLast(a[i]);
			i++;
		}
		
		int n=a.length;
		int ans[]=new int[n-k+1];
		for(;i<n;i++) {
			ans[i-k]=dq.peekFirst();
			if(a[i-k]==dq.peekFirst())
			{	
				dq.pollFirst();
				
				}
			while(!dq.isEmpty() && dq.getLast() <a[i]) {
				dq.pollLast();
			}
			dq.offerLast(a[i]);
			}
			
		ans[n-k]=dq.peekFirst();
		return ans;
		
	}

}
