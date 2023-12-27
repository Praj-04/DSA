package com.week7.recorded.arrays2;

public class MaxAbsoluteDiff {

	public static void main(String[] args) {
		int a[] = { 12, 9, 8, 2, 11, 5, 4, 5 };

	System.out.println(maximumAbsdiff(a));	

	}

	private static int maximumAbsdiff(int[] a) {
		int n = a.length;

		int[] aipi = new int[n];
		int[] aimi = new int[n];

		for (int i = 0; i < n; i++) {
			aipi[i] = a[i] + i;
			aimi[i] = a[i] - i;
		}

		int minaipi = Integer.MAX_VALUE;
		int maxaipi = Integer.MIN_VALUE;

		int minaimi = Integer.MAX_VALUE;
		int maxaimi = Integer.MIN_VALUE;

		for (int e : aipi) {
			minaipi = Math.min(minaipi, e);
			maxaipi = Math.max(maxaipi, e);
		}

		for (int e : aimi) {
			minaimi = Math.min(minaimi, e);
			maxaimi = Math.max(maxaimi, e);
		}
		
		
		int diffaipi=maxaipi-minaipi;
		int diffaimi=maxaimi-minaimi;
		
		return Math.max(diffaipi, diffaimi);
	}

}
