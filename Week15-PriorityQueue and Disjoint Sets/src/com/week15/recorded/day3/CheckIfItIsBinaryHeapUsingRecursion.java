package com.week15.recorded.day3;

public class CheckIfItIsBinaryHeapUsingRecursion {

	public static void main(String[] args) {
int a[]= { 90,15,10,7,12,2};
System.out.println(isItBinaryHeap(a));
	}

	private static boolean isItBinaryHeap(int[] a) {
		int n= a.length;
		return helper(a,n,0);
	}

	private static boolean helper(int[] a, int n, int i) {

		if(i>=n/2) return true;
		
		int left=2*i+1;
		int right=2*i+2;
		
		if(a[i]>=a[left] && helper(a, n, left))
		{
			if(right<n) { //check if right node is present
			return a[i]>=a[right] && helper(a, n, right); // return ans to above parent node
			}
			else return true; // return true if no right node,but prev node satisfies condition
		}
		return false;
	}
	
	

}
