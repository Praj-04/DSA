package com.week11.recorded.Mathematics1;

public class CheckPrime {

	public static void main(String[] args) {
		int n = 20;
		boolean ans = checkPrime(n);
		System.out.println(ans);
	}

	private static boolean checkPrime(int n) {

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}

		return true;

	}

}
