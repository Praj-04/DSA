package com.week7.assignment.arrays1;

public class SpiralOrderMatrix2 {

	public static void main(String[] args) {
	int[][] ans=spiralOrderMatrix(4);

	for(int i=0;i<ans.length;i++) {
		for(int j=0;j<ans[0].length;j++){
			System.out.print(ans[i][j]+ ", ");
	}
		System.out.println();
	}
	}
	
	 public static int[][] spiralOrderMatrix(int n) {
	        int circle = (n+1)/2;
	        int[][] result= new int[n][n];
	int value = 1;
	for(int i=0;i<circle;i++){

	for(int c=i;c<n-i;c++){
	    result[i][c] = value++;
	}

	for(int r=i+1;r<n-i;r++){
	    result[r][n-i-1]=value++;
	}

	for(int c=i+1;c<n-i;c++){
	    result[n-i-1][n-c-1] = value++;
	}

	for(int r=i+1;r<n-i-1;r++){
	    result[n-r-1][i]=value++;
	}
	 



	}

	return result;
	    }

}
