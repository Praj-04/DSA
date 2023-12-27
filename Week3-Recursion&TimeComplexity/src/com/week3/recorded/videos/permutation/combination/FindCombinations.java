package com.week3.recorded.videos.permutation.combination;


//Given a 5 elements, how many combination of 3 can you make?
//[A,B,C,D,E] => (A,B,C)  (B,C,D) (C,D,E)......


public class FindCombinations {

	public static void main(String[] args) {

System.out.println(noOfCombinations(5,3));
	
}

	
static int noOfCombinations(int n, int r) {
	if(n==r || r==0) return 1; 
	return noOfCombinations(n-1, r-1)+ noOfCombinations(n-1, r);
}
}



//Formula to find the no of combinations

// nCr = (n-1)C(r-1) + (n-1)C(r)