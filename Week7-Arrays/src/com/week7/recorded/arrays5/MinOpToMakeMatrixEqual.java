package com.week7.recorded.arrays5;

import java.util.Arrays;

public class MinOpToMakeMatrixEqual {

	public static void main(String[] args) {
		
		int a[][]= {
				{3,63,42},
				{18,12,12},
				{15,21,18},
				{33,84,24}
		};
		int k=3;
		System.out.println(makeMatrixEqual(a, k));

	}

	static int makeMatrixEqual(int a[][], int k) {
		int n = a.length;
		if (n == 0)
			return 0;
		int m = a[0].length;
		int b[] = new int[n * m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[i * m + j] = a[i][j];
			}
		}

		Arrays.sort(b);

		int median = b[n * m / 2]; // or b[b.length/2]

	int count = makeMatrixEqualHelper(b, median, k);
	return count;
	}

	
	static int makeMatrixEqualHelper(int b[],int median,int k) {
		int count = 0;
		for (int i=0;i<b.length;i++) {
			count += Math.abs((b[i]-median)/k) ;
			
		}
		return count;
	}
	
	
	
	
	
	
}
