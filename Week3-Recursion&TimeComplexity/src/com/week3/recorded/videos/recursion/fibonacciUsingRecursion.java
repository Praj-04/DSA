package com.week3.recorded.videos.recursion;

public class fibonacciUsingRecursion {

	public static void main(String[] args) {

		System.out.println(fib(8));
	}

	static int fib(int n) {
		if (n <= 1)
			return n;
	
		return fib(n - 1) + fib(n - 2);     
	}

}
