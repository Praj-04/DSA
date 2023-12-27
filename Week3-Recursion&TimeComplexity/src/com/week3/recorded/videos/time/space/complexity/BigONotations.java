package com.week3.recorded.videos.time.space.complexity;

public class BigONotations {

	public static void main(String[] args) {
		
		int a[]= {3,7,1,7,23,5};
		int key=3;
		checkIfNumberIsPresent(a,7);
	}

	// O(1) 
	// we can directly pick the ans in first try..hence O(1)
	static int getFirstNumberinArray(int[] a) {
		return a[0];
	}
	
	
// O(n)
// the worst case the loop will run n times. say you are looking for the last element or looking for an element that is not present in the array
 static boolean checkIfNumberIsPresent(int[] a,int key) {
	 for(int element : a) {
		 if(element == key) 
			 return true;
		 
	 }
	 return false;
 }
	
	
	
}
