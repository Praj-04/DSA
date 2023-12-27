package com.week11.assignment;

public class UnuiqueII {

	public static void main(String[] args) {
int[] a = {3,9,3,7,2,9,2,9,2,3};		
System.out.println( findUniqueNoInTriplets(a));
	}
	
	static int findUniqueNoInTriplets(int[] a){
		int ans=0;
		for(int i=0;i<32;i++) {
			int count=0;
			for(int e:a) {
				if((e & (1<<i))!=0) { // ==> for each number we are checking set bit  with 0001, 0010,0100,1000 ..
					count++; 
				}
			}
			
			if(count%3!=0) { //if odd count..mean we have 1 bit of the unique number
				ans=ans | 1<<i; // setting the ans position
			}
		}
		return ans;
	}

}
