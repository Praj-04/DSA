package com.week11.recorded.Mathematics1;

import java.util.Arrays;

public class PrimeQueries {

	public static void main(String[] args) {
//		System.out.println(isPrime(17));

		int n = 100;
//		boolean isPrime[] = seiveofEratosthenes(n);
//		for (int i = 0; i <= n; i++) {
//			if (isPrime[i]) {
//				System.out.println(i);
//			}
//		}
		
		int[][] q= {{2,8},{6,12},{3,9}};
		int[] answers= primeQueries(q);
		for(int e:answers) {
			System.out.print(e+" ");
		}
		
	}

	static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static int[] primeQueries(int q[][]) {
		int n = q.length;
		int length = 0;
		
//check the length of  cummulative sum array 
		for (int i = 0; i < n; i++) {
			length = Math.max(length, q[i][1]); // for current query eg:(2,6)..check if length 0  or 6 is big
		}
		boolean isPrime[] = seiveofEratosthenes(length);
		int count[] = new int[length + 1];
		for (int i = 1; i <= length; i++) {
			if (isPrime(i)) { // if current no is prime,
				count[i] = count[i - 1] + 1; // add 1 to count at prev index
			} else {
				count[i] = count[i - 1]; // add same count as prev index
			}
		}
		int ans[] = new int[n];
		for (int i = 0; i < n; i++) {
			int leftCount = count[q[i][0] - 1]; // eg:(2,6)go to the left part of query 2..get the number and from count array..get the count from 1 index prev(1) of count array
			int rightCount = count[q[i][1]];// go to right no (6) of the query, get the number ..and from count array..get the count for index 6
			ans[i] = rightCount - leftCount; // you get the no of prime numbers between 2 and 6
		}

		return ans;
	}
	
	
//create an array where you go from 2--root of N..find if current no is prime and then mark all its multiples as false
	static boolean[] seiveofEratosthenes(int n) {
		boolean isPrime[] = new boolean[n + 1];
		Arrays.fill(isPrime, true);
		isPrime[0] = isPrime[1] = false; // 0 , 1 is not prime

		for (int i = 2; i * i <= n; i++) {  //loop from 2--root of N
			for (int j = i * i; j <= n; j += i) { //loop to multiple of i and mark it false
				isPrime[j] = false;
			}
		}
		return isPrime;

	}
}
