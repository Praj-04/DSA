package com.week12.recorded.treecutter.cowday4;

import java.util.Arrays;

public class AgressiveCows {

	public static void main(String[] args) {
int a[] = {1,2,4,8,9};
int k=3;

System.out.println(aggressiveCow(a, k));
	}

	static int aggressiveCow(int a[], int k) {
		int l = 0, r = (int) 1e9;
		int ans = -1;
		Arrays.sort(a);
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (isPossible(a, k, m)) {
				ans = m;
				l = m + 1;
			} else {
				r = m - 1;
			}

		}
		return ans;
	}

	static boolean isPossible(int a[], int k, int distance) {
		int count = 1;
		int prev = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] - prev >= distance) {
				count++;
				prev = a[i];
			}
		}
		return count >= k;
	}

}
