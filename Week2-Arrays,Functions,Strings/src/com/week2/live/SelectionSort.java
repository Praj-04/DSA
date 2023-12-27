package com.week2.live;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int a[] = { 9, 5, 3, 1, 2 };
		selectionSortSteps(a);
		System.out.println(Arrays.toString(a));
	}

	public static void selectionSortSteps(int[] a) {
		int n = a.length;
for(int i=0;i<n-1;i++) {
	int min=i; // assume i is minimum index 
	for(int j=i+1;j<n;j++) {
		if(a[j]<a[min]) {
			min=j;
		}
	}
	int temp = a[min];
	a[min]=a[i];
	a[i]= temp;  
	
}
		

	}

}
