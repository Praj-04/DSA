package com.week13.recorded.day5.distributecandi.mincosttocutboard;

import java.util.Arrays;
import java.util.Collections;

public class MinCostToCutBoardIntoSquares {

	public static void main(String[] args) {
Integer h[]= {4,1,2};
Integer v[]= {2,1,3,1,4};
System.out.println(minCuts(v, h));
	}

	public static int minCuts(Integer[] v, Integer[] h) {
		Arrays.sort(v,Collections.reverseOrder());
		Arrays.sort(h,Collections.reverseOrder());
		int hor = 1;
		int ver = 1;

		int i = 0; // vertical
		int j = 0; // horizontal
		int count = 0;

		while (i < v.length && j < h.length) {
			if (h[j] < v[i]) {
				count += hor * v[i];
				ver++;
				i++;
			} else {
				count += ver * h[j];
				j++;
				hor++;
			}

		}

		int totalVerticalCount = 0;
		while (i < v.length) {
			totalVerticalCount += v[i];
			i++;
		}

		count += totalVerticalCount * hor;

		int totalHorizontalCount = 0;
		while (j < h.length) {
			totalHorizontalCount += h[j];
			j++;
		}

		count += totalHorizontalCount * ver;

		return count;
	}

}
