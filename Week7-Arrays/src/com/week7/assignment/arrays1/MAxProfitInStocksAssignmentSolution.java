package com.week7.assignment.arrays1;

import java.util.Arrays;

public class MAxProfitInStocksAssignmentSolution {

	public static void main(String[] args) {
	int[] prices = { 990,1000, 508, 257,6,994, 930, 90, 45, 950, 89, 33, 92 };
	//	int[] prices = {9,17,4,18,5};
//	int[] prices = {69 ,990, 508}; 


		int n= prices.length;
		int max=0;
		
		int ans=helper(prices,n,max);
		System.out.println(ans);
		
		
	}

	private static int helper(int[] prices, int n, int max) {
		for(int i=0;i<n-1;i++) {
			for (int j=i+1;j<n;j++) {
				if(prices[i]<prices[j]) {
					int latest=prices[j]-prices[i];
					if(latest>max) {
						max=latest;
					}
					
				}
			}
		
		}
		return max;
		
	}
	
}
