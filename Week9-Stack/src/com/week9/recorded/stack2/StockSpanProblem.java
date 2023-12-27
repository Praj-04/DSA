package com.week9.recorded.stack2;

import java.util.ArrayDeque;

public class StockSpanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[]= {100,80,60,70,60,75,85};
		int a[]= {10,20,30,40,50};
int s[]=stockSpan(a);
for(int e:s) {
	System.out.print(e+ " ");
}
	}
	
	
	static int[] stockSpan(int a[]) {
		int n=a.length;
		int s[]= new int[n];
		
		
		
		s[0]=1;
		
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		
		stack.push(0);
		
		for(int i=1;i<n;i++) {
			while(!stack.isEmpty()) {
				int top=stack.peek();
				if(a[top]> a[i]) {
					break;
				}else {
					stack.pop();
				}
			}
			if(stack.isEmpty()) {
				s[i]=i+1;
			}else {
				
				s[i]=i-stack.peek();
				
			}
			stack.push(i);
			
		}
		return s;
		
		}

}
