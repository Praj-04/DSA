package com.week11.recorded.bitwise2;

public class ClearIthBit {

	public static void main(String[] args) {
		int n=9;int i=3;
int bit=clearIthBit(n, i);
System.out.println(bit);

	}

	
	public static int clearIthBit(int n,int i) {
		int mask = ~(1<<i);
		return (n & mask );
	}
	
}
