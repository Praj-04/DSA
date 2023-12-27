package com.week12.recorded.squareRoot.median.day3;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
int[] a= {3,5,6};
int[] b= {2,4,10,12};
System.out.println(medianOfTwoSortedArray(a, b));
	}

	static double medianOfTwoSortedArray(int a[], int b[]) {
		int n1 = a.length;
		int n2 = b.length;
		int n = (n1 + n2); // total no of elements from 2 array
		int left = (n + 1) / 2; // no of elements that we need on left side ..this is for both even and odd no
										// of elements case

		// IMP=> we should do binary search on smaller array..if both array are same do
		// on 1st array

		if (n1 > n2) {
			return medianOfTwoSortedArray(b, a); // if 1st given array is big,we are just switching the variable..
//			i.e sending contents of b to array a and contents of a to array b
		}

		// now we know n1 is <= n2..i.e array a is small
		int l = 0;
		int r = n1;
		while (l <= r) {
			int m1 = (l + r) / 2;
			int m2 = left - m1;

			int l1 = m1 <= 0 ? Integer.MIN_VALUE : a[m1 - 1];
			int l2 = m2 <= 0 ? Integer.MIN_VALUE : b[m2 - 1];

			int r1 = m1 >= n1 ? Integer.MAX_VALUE : a[m1];
			int r2 = m2 >= n2 ? Integer.MAX_VALUE : b[m2];

			if (l1 <= r2 && l2 <= r1) { // found the median
				if (n % 2 == 0) {
					return (double) (Math.max(l1, l2) + Math.min(r1, r2)) / 2; // if even no of elements present
				} else {
					return Math.max(l1, l2); // for odd no of elements
				}
			} else if (l1 > r2) {
				r = m1 - 1;
			} else if (l2 > r1) {
				l = m1 + 1;
			}
		}
		return 0;
	}
}

