package com.week14.live;

import java.util.HashMap;
import java.util.Map;

public class SumOfAllSubMatrices {

	public static void main(String[] args) {
		int[][] M = { { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 2 }, { 2, 2, 2, 2 } };

		int T = 8;
		System.out.println(sumEqualTarget(M, T));
	}

	public static int sumEqualTarget(int[][] M, int T) {

		int rows = M.length;
		int cols = M[0].length;

		// find cumulative sum of the given matrix => preprocessing
		for (int i = 0; i < rows; i++) {
			for (int j = 1; j < cols; j++) { // 0th column will have same values,hence starting with 1
				M[i][j] += M[i][j - 1];
			}
		}

		Map<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		// go to all column pairs
		for (int i = 0; i < cols; i++) {
			for (int j = i; j < cols; j++) {
				int sum = 0;
				map.clear();
				map.put(0, 1);
				for (int k = 0; k < rows; k++) { // for each column pair,check row wise current pair value and subtract
													// with prev col of colum pair to get the ans. subtraact ans with
													// target see if this is already present in map..if present add the
													// freq +1 to ans else add 0 to ans..if not present in map add the sum to map with 1
					sum += (M[k][j] - (i > 0 ? M[k][i - 1] : 0));
					int freq = map.getOrDefault(sum - T, 0); // add sum to map..
					ans += freq;
					map.put(sum, map.getOrDefault(sum, 0) + 1);
				}
			}
		}
		return ans;

	}

}
