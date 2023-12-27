package com.week12.recorded.upper.lower.sortedRotatedArray.day2;

public class UpperLowerSortedRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a[] = { 2, 4, 4, 4, 6, 8, 10 };
//		int k = 4;
//		System.out.println(upperBound(a, k));
//		System.out.println(lowerBound(a, k));
		
		
//		int a[] = { 10,11,12,2,3,4,6,7,9};
//		int k=11 ;
//		System.out.println(findSortedRotatedArray(a,k)); // works only in non repeated array
	
		int a[] = { 3,1,2,3,3,3,3};
		int k=3 ;
		System.out.println(findSortedRotatedArrayWithDuplicates(a,k)); 
	
	
	}

	public static int upperBound(int a[], int k) {

		int l = 0;
		int r = a.length - 1;
		int ans = 1;
		if (k < a[0]) {
			return ans;
		}
		if (k > a[a.length - 1]) {
			return a.length;
		}
		while (l <= r) {
			int m = l + (r - l) / 2;

			if (k < a[m]) {
				ans = m;
				r = m - 1;
			} else if (k >= a[m]) {
				l = m + 1;
			}
		}
		return ans;
	}

	public static int lowerBound(int a[], int k) {
		int l = 0;
		int r = a.length - 1;
		int ans = -1;
		if (k < a[0]) {
			return ans;
		}
		if (k > a[a.length - 1]) {
			return a.length - 1;
		}
		while (l <= r) {
			int m = l + (r - l) / 2;

			if (k <= a[m]) {

				r = m - 1;
			} else if (k > a[m]) {
				ans = m;
				l = m + 1;
			}
		}
		return ans;
	}

	static int findSortedRotatedArray(int a[], int k) {
		int l = 0;
		int r = a.length - 1;

		while (l <= r) {
			int m = l + (r - l) / 2;

			if (a[m] == k)
				return m;

			if (a[l] <= a[m]) // check if left part is sorted
			{
				if (k >= a[l] && k < a[m]) { // check if target is present in the left sorted part
					r = m - 1; // if present check here
				} else {
					l = m + 1; // if not present then have to check the right unsorted part
				}

			} else { // right part is sorted
				if (k > a[m] && k <= a[r]) { // check if k is present in the sorted right part
					l = m + 1; // if present
				} else {
					r = m - 1; // else k present in left unsorted part
				}

			}
		}
		return -1;
	}

	static int findSortedRotatedArrayWithDuplicates(int a[], int k) {
		int l=0; int r= a.length-1;
		int ans=-1;
		while(l<=r){
		  int m = l+(r-l)/2;


		if(a[l]<=a[m]){
		if(k>=a[l] && k<=a[m]){
		  r=m-1;
		  ans=m;
		}else{
		  l=m+1;
		}
		}else{
		  if(k>a[m] && k<=a[r]){
		    l=m+1;
		  }else{
		    r=m-1;
		    ans=m;
		   
		  }

		}

		}
		    return ans;
	}
	
}
