package com.week3.recorded.videos.recursion;

public class SumOfNNumbers {

	public static void main(String[] args) {
		System.out.println(sumOFNNaturalNos(1));
	}
	
	static int sumOFNNaturalNos(int n) {
		if(n<=1) return n;
		
		return sumOFNNaturalNos(n-1)+n; 
		
		
	}

}
