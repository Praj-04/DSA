package com.week7.recorded.arrays1;

import java.util.Arrays;

public class WaveLength {

	public static void main(String[] args) {
		int[] a = { 10, 4, 2, 9, 8, 5, 19 };

		// using lexographical order
		
//		findSolutionLexographically(a);
		
		findSolutionNotLexographically(a);
		
		
		for(int ans:a) {
			System.out.print(ans + " ");
		}
	}

	private static void findSolutionNotLexographically(int[] a) {

		for(int i=1;i<a.length;i+=2) {
			
			if(a[i] > a[i-1]) {
				swap(a,i,i-1);
			}
			
			if(i<a.length-1 && a[i] > a[i+1]) {
				swap(a,i,i+1);
			}
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]= temp;
		
	}

	private static void findSolutionLexographically(int[] a) {
	
		Arrays.sort(a); 
		for(int i=1;i<a.length;i+=2) {
			int temp=a[i];
			a[i]=a[i-1];
			a[i-1]= temp;
			
		}
		
		
	}

	

}
