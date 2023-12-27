package com.assignment.recursion;

public class IsArraySorted {

	public static void main(String[] args) {
int[] arr = {1,22,3,4,5};
System.out.println(isItSorted(arr,arr.length));

	}

	
	 static boolean isItSorted(int[] arr,int n) {
		 
		 
		 if(n==1) return true;
			
			if(arr[n-2]>arr[n-1]) {
				return false;
			}
			
				
		return isItSorted(arr, n-1);
		 
	}
	 
	

}
