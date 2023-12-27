package com.homework;

public class FactorialOfN_1 {

	public static void main(String[] args) {

		int n=5;
	
		System.out.println(Solution(n));

	}

	static int Solution(int n) {
		if(n<=1)return 1;
		
		return Solution(n-1)*n;
	}
	}


