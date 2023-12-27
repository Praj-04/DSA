package com.week1.live.patterns;

public class Pattern6 {

	public void innerLoop(int i, int n) {
		for (int j = 0; j < n - i; j++) {
			System.out.print(" ");
		}
		System.out.print("*");

		for (int l = 0; l <= 2 * i - 1; l++) { // 2(i-1)-1

			if (l == 2 * i - 1) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
	}

	public static void main(String[] args) {
		Pattern6 p = new Pattern6();
		int n = 6;

		for (int i = 0; i < n; i++) {
			p.innerLoop(i, n);
			System.out.println();
		}

		for (int i = n - 2; i >= 0; i--) {
			p.innerLoop(i, n);
			System.out.println();
		}

	}

}
