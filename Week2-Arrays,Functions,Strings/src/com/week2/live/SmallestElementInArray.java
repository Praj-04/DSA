package com.week2.live;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int[] a = { 4, 3, 8, 2, 1, 7 };

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println(min);

	}

}
