package com.week11.recorded.bitwise2;

public class GetIthBit {

	public static void main(String[] args) {
		int n=9;int i=3;
int bit=getIthBit(n, i);
System.out.println(bit);

	}

	
	public static int getIthBit(int n,int i) {
		int mask = 1<<i;
		return (n & mask )==0 ?0:1;
	}
	
}
