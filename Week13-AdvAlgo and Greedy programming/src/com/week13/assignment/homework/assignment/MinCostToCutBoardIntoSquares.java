package com.week13.assignment.homework.assignment;

import java.util.Arrays;
import java.util.Collections;

public class MinCostToCutBoardIntoSquares {

	public static void main(String[] args) {
		int h[] = { 4, 2, 1, 6, 5 };
		int v[] = { 2, 3 };
		System.out.println(minCuts(v, h));
	}

	public static long minCuts(int[] X, int[] Y) {

		Arrays.sort(X);
		Arrays.sort(Y);

		int last = X.length - 1;
		int midX = X.length / 2;

		for (int i = 0; i < midX; i++) {
			int temp = X[i];
			X[i] = X[last - i];
			X[last - i] = temp;
		}

		System.out.println(Arrays.toString(X));
		int lastY = Y.length - 1;
		int midY = Y.length / 2;

		for (int i = 0; i < midY; i++) {
			int temp = Y[i];
			Y[i] = Y[lastY - i];
			Y[lastY - i] = temp;
		}

		System.out.println(Arrays.toString(Y));

		long cost = 0;
		long horizontalCount = 1;
		long verticalCount = 1;
		int i = 0;
		int j = 0;

		while (i < X.length && j < Y.length) {
			if (X[i] >= Y[j]) {
				cost += X[i] * verticalCount;
				i++;
				horizontalCount++;
			} else {
				cost += Y[j] * horizontalCount;
				j++;
				verticalCount++;
			}
		}

		long totalHorizontalCount = 0;

		while (i < X.length) {
			totalHorizontalCount += X[i];
			i++;
		}
		cost += totalHorizontalCount * verticalCount;

		long totalVerticalCount = 0;

		while (j < Y.length) {
			totalVerticalCount += Y[j];
			j++;
		}
		cost += totalVerticalCount * horizontalCount;

		return cost;

	}

}
