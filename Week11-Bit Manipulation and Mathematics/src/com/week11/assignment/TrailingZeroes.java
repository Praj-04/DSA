package com.week11.assignment;

public class TrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(trailingZeroes(15));	
//		trailingZeroes(15)
		

	}
	
	 public static long trailingZeroes(int n) {
		  	//You Can Code Here

		  if (n < 0)
	            return -1;
	 
	            int count = 0;
	 
	            for (int i = 5; n / i >= 1; i *= 5)
	            count += n / i;
	 
	        return count;
		  }

}
