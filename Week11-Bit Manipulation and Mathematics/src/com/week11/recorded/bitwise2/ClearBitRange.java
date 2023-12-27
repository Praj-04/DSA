package com.week11.recorded.bitwise2;

public class ClearBitRange {

	public static void main(String[] args) {
		int n=724;int i=2;int j=6 ;
System.out.println( clearIthBit(n, i,j));


	}

	
	public static int clearIthBit(int n,int i,int j) {
		
		int a= ~0 << (j+1);
		int b = (1<<i) -1;
		int mask= a|b;
		return n&mask;
		
	}
	
}
