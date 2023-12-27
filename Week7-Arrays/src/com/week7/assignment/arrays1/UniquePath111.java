package com.week7.assignment.arrays1;

import java.text.DateFormatSymbols;

public class UniquePath111 {

	public static void main(String[] args) {

		int[][] grid = { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } };

		int ans = uniquePath(grid);
		System.out.println(ans);
	}

	private static int uniquePath(int[][] grid) {

		// first we will count all the 0's and also get the position of 1(start
		// position)..store the position in sx,sy
		int countZero = 0;
		int sx = 0;
		int sy = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 0) {
					countZero++;
				} else if (grid[i][j] == 1) {
					sy = j;
				}
			}
		}
		return helper(grid, sx, sy, countZero);
	}

	private static int helper(int[][] grid, int sx, int sy, int countZero) {

		// check we are outside the grid
		if (sx < 0 || sy < 0 || sx >= grid.length || sy >= grid[0].length || grid[sx][sy] == -1) {
			return 0;
		}

		if (grid[sx][sy] == 2) {
			return countZero == 0 ? 1 : 0;
		}

		if (grid[sx][sy] == 0)
			countZero--;
		grid[sx][sy] = -1;

		int totalPath = helper(grid, sx + 1, sy, countZero) + 
				helper(grid, sx - 1, sy, countZero) +
				helper(grid, sx, sy + 1, countZero) +
				helper(grid, sx, sy - 1, countZero);
grid[sx][sy] =0;
countZero++;
		return totalPath;
	}

}
