package com.week2.live;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

//		int a[]= {4,1,8,3,7};
		int a[] = { 9, 5, 3, 1, 2 };
		bubbleSortSteps(a);
		System.out.println(Arrays.toString(a));
	}

	public static void bubbleSortSteps(int[] a) {
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {
			boolean didISwap = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;

					didISwap = true;
				}
			}
			if (!didISwap)
				break;

		}

	}

}
