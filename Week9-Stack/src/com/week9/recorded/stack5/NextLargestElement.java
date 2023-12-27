package com.week9.recorded.stack5;

import java.util.ArrayDeque;

public class NextLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,6,4,10,2,4};
int ans[]=smallestToright(a);
for(int i:ans) {
	System.out.print(i + " ");
}
	}

	
	static int[] smallestToright(int[] a) {
		int n= a.length;
		int[] ans = new int[n];
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		for(int i=n-1;i>=0;i--) {
			
			while(!stack.isEmpty() && a[stack.peek()]<=a[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				ans[i]=n;
			}
			else {
				ans[i]=stack.peek();
				
			}
			stack.push(i);
		}
		return ans;
		
	}
}
