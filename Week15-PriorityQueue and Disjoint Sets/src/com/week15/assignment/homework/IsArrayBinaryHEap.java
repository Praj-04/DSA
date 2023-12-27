package com.week15.assignment.homework;

public class IsArrayBinaryHEap {

	public static void main(String[] args) {
long[] arr= {90, 15, 10, 7, 12, 2}	;
int n= arr.length;
System.out.println(countSub(arr, n));
}
	
	 public static boolean countSub(long arr[], long n) {
		    
	       for(int i=1;i<arr.length;i++){
	int parent = (i-1)/2;
	if(arr[parent]> arr[i]){
	continue;
	}
	return false;

	       }

	       return true;






	    }

}
