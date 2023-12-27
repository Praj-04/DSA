package com.week11.recorded.bitwise3;

public class CountNoOfSetBits {

	public static void main(String[] args) {
//System.out.println(countNoOfSetBits(12));  
System.out.println(countNoOfSetBits2ndWay(12));
		
	}
	static int countNoOfSetBits(int n) {
		int count =0;
		while(n!=0) {
			if((n&1)!=0) {
				count++;
			}
			n=n>>1;
		}
		return count;
		
	}
	
	static int countNoOfSetBits2ndWay(int n) {
		int count =0;
		while(n!=0) {
			n=n&(n-1);
			count++;
		}
		return count;
		
	}

}
