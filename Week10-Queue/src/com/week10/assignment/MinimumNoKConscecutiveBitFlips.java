package com.week10.assignment;

import java.util.LinkedList;
import java.util.Queue;
 

public class MinimumNoKConscecutiveBitFlips {

	public static void main(String[] args) {
		int nums[] = { 0, 0, 0, 1, 0, 1, 1, 0 };

		int k = 3;
		int ans = minNoKConsecutiveBitFlips(nums, k);
		System.out.println(ans);
	}

	public static int minNoKConsecutiveBitFlips(int a[], int k) {
		int count = 0;
		Queue<Integer> q = new LinkedList<>();
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if ((q.size() & 1)!= 0) { // means its odd 
				a[i] = a[i] ^ 1;
			}
			if (a[i] == 0) {
				if (i + k > n) {
					return -1;
				}
				count++;
				q.offer(i + k - 1);
				}
			if (!q.isEmpty() && q.peek() == i) {
				q.poll();
			}
		}
		return count;
	}
}
