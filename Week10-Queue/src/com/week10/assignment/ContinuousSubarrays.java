package com.week10.assignment;

import java.util.ArrayDeque;

//Didnt understand this code
public class ContinuousSubarrays {

	public static void main(String[] args) {
int a[]= {6,5,2,5,3};
int ans = helper(a);
System.out.println(ans);
		
	}

	private static int helper(int[] a) {
		int count =0;
		ArrayDeque<Integer> max = new ArrayDeque<>();
		ArrayDeque<Integer> min = new ArrayDeque<>();
		int l=0;
		int n= a.length;
		for(int r=0;r<n;r++) {
			while(!min.isEmpty() && min.getLast()>a[r]) {
				min.pollLast();
			}
			min.offerLast(a[r]);
			while(!max.isEmpty() && max.getLast() < a[r]) {
				max.pollLast();
			}
			max.offerLast(a[r]);
			while(max.getFirst()-min.getFirst()>2) {
				if(min.getFirst()==a[l]) {
					min.pollFirst();
				}
				if(max.getFirst()==a[l]) {
					max.pollFirst();
				}
				l++;
			}
			
			count+=(r-l+1);
		}
		return count;
		
		
		
	}

}
