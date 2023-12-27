package com.week12.recorded.day1;

public class IntroToBinarySearch {

	public static void main(String[] args) {
//int a[]	= {2,4,6,8,10,15,17};
//int key=2 ;

//1. Iterative approach
//int ans =binarySearchIterative(a,key);
//System.out.println(ans);

//2. Recursive approach
//int l=0; int r=a.length-1;
//System.out.println(binarySearchRecursively(a, key, l, r));

//3.FirstOccurance
//int a[]	= {2,2,2,4,6,8,10,15,15,17};
//int key=15;
//System.out.println(firstOccurance( a, key));
		
//4. lastOccurance
//int a[]	= {2,2,2,4,6,8,10,15,15,17};
//int key=2;
//System.out.println(lastOccurance( a, key));

		
//5.Count no of occurances
		int a[]	= {2,2,2,4,6,8,10,15,15,17};
		int key=9;	
		System.out.println(countOccurances(a, key));
		
	}
	
	
	static int binarySearchIterative(int a[],int k) {
		int l=0;int r=a.length-1;
		 while(l<=r) {
			 int m=l+(r-l)/2;
			 if(a[m]==k) {
				return m; 
			 }
			 if(k<a[m]) {
				r=m-1; 
			 }else if(k>a[m]) {
				 l=m+1;
			 }
		 }
		 
		 return -1;
	}
	
	
	static int binarySearchRecursively(int a[],int k,int l,int r) {
		while(l>r) return -1;
		int m=l+(r-l)/2;
		if(a[m]==k) return m;
		if(k<a[m]) return binarySearchRecursively(a, k, l, m-1);
		return binarySearchRecursively(a, k, m+1, r);
		
	}
	
	
	static int firstOccurance(int a[],int k) {
		int l=0;int r = a.length-1;
		int ans=-1;
		while(l<=r) {
			int m=l+(r-l)/2;
			if(k<a[m]) {
				r=m-1;
							}
			else if(k>a[m]) {
				l=m+1;
			}else {
				r=m-1;
				ans=m;
			}
			
		}
		return ans;  
	}
	

	static int lastOccurance(int a[],int k) {
		int l=0;int r = a.length-1;
		int ans=-1;
		while(l<=r) {
			int m=l+(r-l)/2;
			if(k<a[m]) {
				r=m-1;
							}
			else if(k>a[m]) {
				l=m+1;
			}else {
				l=m+1;
				ans=m;
			}
			
		}
		return ans;  
	}
	
	
	
	static int countOccurances(int[]a,int k) {
		
		int fo=firstOccurance(a, k);
		if(fo==-1)return 0;
		
		int lo=lastOccurance(a, k);
		return lo-fo+1;
		
		
	}

}
