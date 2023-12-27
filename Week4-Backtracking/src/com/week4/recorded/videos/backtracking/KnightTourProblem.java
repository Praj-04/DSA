package com.week4.recorded.videos.backtracking;

public class KnightTourProblem {
 
	public static void main(String[] args) {
		int n = 5;
		int a[][] = knightsTour(n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[][] knightsTour(int n) {
		int a[][] = new int[n][n]; // output will be saved here

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = -1; // set the result values to -1 initially
			}
		}

		a[0][0] = 0;// setting the first position value to 0 in the output box
		int movesX[] = { 2, 1, -1, -2, -2, -1, 1, 2 }; // position of x
		int movesY[] = { 1, 2, 2, 1, -1, -2, -2, -1 }; // position at y (x,y ) is 1 valid position the knight can travel

		knightsTourHelper(n, a, movesX, movesY, 0, 0, 1);
		return a;
	}

	static boolean knightsTourHelper(int n, int a[][], int movesX[], int movesY[], int curX, int curY, int step) {
		if (step == n * n)
			return true; // if n=8 ..then the last step is 64..that is you reached the last position

		for (int i = 0; i < 8; i++) { // 8 because you can go to 8 position from one point
			int nextX = curX + movesX[i];
			int nextY = curY + movesY[i];
			if (isValid(n, a, nextX, nextY)) {
				a[nextX][nextY] = step;
				boolean isTourCompletedByGoingThere = knightsTourHelper(n, a, movesX, movesY, nextX, nextY, step + 1);
				if (isTourCompletedByGoingThere) {
					return true;
				} else {
					a[nextX][nextY] = -1;
				}
			}

		}
		return false;

	}

	static boolean isValid(int n, int a[][], int x, int y) {
		if (x >= 0 && y >= 0 && x < n && y < n && a[x][y] == -1) { // checking if you are inside the box and not visited
																	// a space
			return true;
		}
		return false;
	}
}
