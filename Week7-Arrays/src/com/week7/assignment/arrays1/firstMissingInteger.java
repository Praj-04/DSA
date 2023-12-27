package com.week7.assignment.arrays1;

import java.util.Arrays;

public class firstMissingInteger {

	public static void main(String[] args) {
//		int[] A = { -1, 1, 2, 3, 4 };
		int[] A = { 1,0,2 };
		int missing= find(A);
		System.out.println(missing);
	}
	
	
	

		private static int find(int[] A) {
			int i=0;
		      int n=A.length;
		      System.out.println(Arrays.toString(A));
		        while(i<A.length){
		              if(A[i]<=n && A[i]>0 && A[A[i]-1] != A[i] && A[i]!=i+1){
		              int temp=A[i];
		              A[i]=A[temp-1];
		              A[temp-1]=temp;
		             System.out.println(Arrays.toString(A));
		          }
		          else{
		            ++i;
		          }
		        }
		        for(int j=1; j<=n; j++){
		            if(A[j-1]!=j){
		                return j;
		            }
		        }
		        return n+1;	}




		

	

}
