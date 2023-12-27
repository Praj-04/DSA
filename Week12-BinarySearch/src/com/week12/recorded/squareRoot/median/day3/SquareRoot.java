package com.week12.recorded.squareRoot.median.day3;

public class SquareRoot {

	public static void main(String[] args) {
		int n = 113488;
		System.out.println(SquareRootOfAnInteger(n));
	}

	public static int SquareRootOfAnInteger(int n) {
		long l = 1;
		long r = n;
		long ans = 1;

		while (l <= r) {
			long m = (l + r )/ 2;
			System.out.println(" 1.mid is "+ m);

			if (m * m == n) {
				System.out.println(" mid is" + m*m);
				return (int) m;
			}

			if (m * m > n) {
				System.out.println(m*m + " greater than n,so move left");
				
				r = m - 1;

			} else {
				System.out.println(m*m + " lesser than n,so move right");
				ans = m;
				l = m + 1;
			}

		}
		return (int)ans;
	}
}
