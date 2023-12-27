package com.week7.assignment.arrays1;

import java.util.Arrays;

public class DutchFlagAlgorithm {

	public static void main(String[] args) {
int A[] = {2,0,1,1,2,1,0,1,0};
int n= A.length-1;
 int l=0;
 int m=0;
 int h=n;
 
 
 while(m<=h) {
	 if(A[m]==2) {
		 A[m]=A[h];
		 A[h]=2;
		 h--;
	 }else if(A[m]==0){
 A[m]=A[l];
 A[l]=0;
 l++;
 m++;
	 }else if(A[m]==1) {
	 m++;
	 }
	 }
 System.out.println(Arrays.toString(A));
 
	}

}
