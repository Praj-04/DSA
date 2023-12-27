
//Swap 3 and 2 index elements

package com.week2.live;

import java.util.Arrays;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 12, 4 };

		swapArray(a, 1, 4);

	}

	public static void swapArray(int[] a, int x, int y) {
//		int temp = 0;
//		temp = a[x];
//		a[x] = a[y];
//		a[y] = temp;
//		System.out.println(Arrays.toString(a));
		
		// OR
		
		a[x]=a[x]^a[y];
		a[y]=a[x]^a[y];
		a[x]=a[x]^a[y];
		
		System.out.println(Arrays.toString(a));
	}

}
