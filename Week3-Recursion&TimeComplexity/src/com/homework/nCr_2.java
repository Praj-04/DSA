package com.homework;

public class nCr_2 {

	public static void main(String[] args) {
		System.out.println(nCr(1, 2));

	}

	public static int nCr(int n, int r) {
		
		if (n == r || r == 0) // according to pascal triangle..check notesbook for explanation
			return 1;
		if(n<r) return 0;  // if n<r then return 0
			
			return nCr(n - 1, r - 1) + nCr(n - 1, r);


	}

}
