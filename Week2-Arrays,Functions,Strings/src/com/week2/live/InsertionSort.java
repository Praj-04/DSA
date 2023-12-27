package com.week2.live;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int a[] = { 9, 5, 3, 1, 2 };
		insertionSortSteps(a);
		System.out.println(Arrays.toString(a));
	}

	private static void insertionSortSteps(int[] a) {
		
		int n=a.length;
		for(int i=1;i<n;i++) {
			int last = a[i];
			int swapIndex = i-1;
			while(swapIndex >=0 && a[swapIndex]>last) {
				swapIndex--;
			}
			int j=i;
			while(j> swapIndex+1) {
				a[j]=a[j-1];
				j--;
			}
			a[swapIndex+1] = last;
		}
		
		
	}

	}


