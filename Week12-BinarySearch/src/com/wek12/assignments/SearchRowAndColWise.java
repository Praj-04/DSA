package com.wek12.assignments;

public class SearchRowAndColWise {

	public static void main(String[] args) {
		int[][] mat = { { 1, 4, 8 }, { 3, 7, 9 }, { 14, 18, 12 } };
		int x = 1;
		int[] ans = findElement(mat, x);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

	public static int[] findElement(int[][] mat, int x) {
		// You Can Code Here
		int[] ans = { -1, -1 };
		int l = 0;
		int h = mat.length - 1;
		int col = mat[0].length - 1;
		int flag=0;
		while (l <= h) {

			int m = l + (h - l) / 2; // got mid row
			if (mat[m][0] <= x && mat[m][col] >= x) {
				isFound(mat, m, x, col, ans);
				if(flag==1) {

					return ans;
				}

			} else if (x > mat[m][col]) {
				l = m + 1;
			} else if (x < mat[m][col]) {
				h = m - 1;
			}

		}
		return ans;
	}

	public static int isFound(int[][] mat, int m, int x, int col, int[] ans) {
		int low = 0;
		int high = col;
		System.out.println("high is"+high);
		while (low <= high) {
			int midElement = low + (high - low) / 2;
			if (mat[m][midElement] == x) {
				ans[0] = m;
				ans[1] = midElement;
				return 1;
			} else if (mat[m][midElement] > x) {
				high = midElement - 1;
			} else {
				low = midElement + 1;
			}
		}

		return 0;
	}

}
