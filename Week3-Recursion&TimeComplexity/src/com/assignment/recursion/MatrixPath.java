package com.assignment.recursion;


//Count every path that can lead from the top left to the bottom right of a M X N matrix,
//with the restriction that you can only move right or down from each cell


public class MatrixPath {

	public static void main(String[] args) {
		int m=2;int n=3;
System.out.println(numberOfPaths(m,n));
	}

	
	public static int numberOfPaths(int m, int n) {

	     if(n==1 || m==1) return 1;

	      return numberOfPaths(m-1,n)+ numberOfPaths(m,n-1);

	    }
}
