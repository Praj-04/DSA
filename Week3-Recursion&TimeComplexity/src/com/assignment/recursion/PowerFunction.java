package com.assignment.recursion;

//Given two integers x and n, write a function to determine x^n.

//Example 1:
//
//Input : 
//x = 2, n = 3
//Output : 
//8

//Example 2:
//
//Input :
//x = 1, n = 1
//Output :
//1

public class PowerFunction {

	public static void main(String[] args) {
		System.out.println(power(2, 3));
	}

	public static int power(int x, int n) {
		if (n == 0)
			return 1;

		return power(x, n - 1) * x;

	}
}
