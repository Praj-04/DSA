package com.week7.assignment.arrays1;

import java.util.Arrays;

public class MAxProfitInStocks {
	
	public static void main(String[] args) {
		int[] prices = {69 ,990, 508}; 
//		int[] prices = { 990,1000, 508, 257,6,994, 930, 90, 45, 950, 89, 33, 92 };
		//	int[] prices = {9,17,4,18,5};
	
	  int maxProfit = 0;
      int l = prices.length-1; 
      int r =0;
      int minTrade = Integer.MAX_VALUE;


          while(r<l){
              if( prices[r] < minTrade) {
                  minTrade = prices[r];
                  r++;
                  while(r<l) {

                      maxProfit = Math.max(maxProfit, (prices[l] - minTrade));
                      l--;

                  }


          }

      }
      System.out.println(maxProfit);
  }
}



	


//	public static void main(String[] args) {
////		int[] prices = { 990,1000, 508, 257, 6,994, 930, 90, 45, 950, 89, 33, 92 };
//		int[] prices = {9,17,18,5};
//		int n = prices.length;
//		int min = findMin(prices);
//		System.out.println("min is" + min);
//		int indexMin = -1;
//		for (int i = 0; i < n; i++) {
//
//			if (prices[i] == min) {
//				indexMin = i;
//				break;
//			}
//
//		}
//
//		System.out.println("min index:" + indexMin);
//
//		int max = findMax(prices);
//		System.out.println(max);
//		int indexMax = n;
//		for (int i = n - 1; i >= 0; i--) {
//
//			if (prices[i] == max) {
//				
//				indexMax = i;
//				break;
//			}
//
//		}
//
//		System.out.println("max index:" + indexMax);
//		
//		int answer = helper(prices,indexMin,indexMax);
//		System.out.println(answer);
//
//	}
//
//	private static int helper(int[] prices, int indexMin, int indexMax) {
//	int n= prices.length;
//		if(n>1 && indexMin < indexMax) {
//			return indexMax-indexMin;
//		}
//		
//		return 0;
//	}
//
//	private static int findMax(int[] prices) {
//		int max = Integer.MIN_VALUE;
//
//		int n = prices.length;
//		for (int i = 0; i < n; i++) {
//			if (prices[i] > max) {
//				max = prices[i];
//			}
//		}
//		System.out.println(max);
//		return max;
//	}
//
//	private static int findMin(int[] prices) {
//		int min = Integer.MAX_VALUE;
//
//		int n = prices.length;
//		for (int i = 0; i < n; i++) {
//			if (prices[i] < min) {
//				min = prices[i];
//			}
//		}
//		System.out.println(min);
//		return min;
//	}
//
//}
