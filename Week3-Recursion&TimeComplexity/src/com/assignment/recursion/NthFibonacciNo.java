package com.assignment.recursion;

public class NthFibonacciNo {

	public static void main(String[] args) {
		int n = 31;
		System.out.println(Solution(n));

	}

	static int Solution(int n) {
		if(n<=1)return n;
		
		return Solution(n-1)+Solution(n-2);
	}

}
