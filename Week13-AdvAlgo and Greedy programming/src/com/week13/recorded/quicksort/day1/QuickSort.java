package com.week13.recorded.quicksort.day1;

public class QuickSort {

	public static void main(String[] args) {

		int a[]= {4,6,2,5,7,9,1,3};
		quicksort(a, 0, a.length-1);
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
	
	static void quicksort(int a[],int l,int h) {
		if(l<h) {  // if more than 1 element are present,then do below
			int pivot=partition(a,l,h); //we are calling the partition now for the left part,we get the pivot ele to its posi
		quicksort(a, l, pivot-1); //recursion..get the 1st ele of left part
		quicksort(a, pivot+1, h); //recursion..get 1st ele of right part
		}
	}
	
	static int partition(int a[],int l,int h) {
		int pivot =a[l]; //we take 1st eleemnt as pivot
		int i=l;int j=h;
		
		while(i<=j) {
			while (i<=h && a[i]<=pivot) {
				i++;
			}
			while(j>=l && a[j]>pivot) {
				j--;
			}
			if(i<j) {
				swap(a,i,j);
			}
				}
		swap(a,l,j);
		return j;  // the pivot element comes to its posi..now we have to sort left and right part
		
	}
	
	static void swap(int a[],int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}
