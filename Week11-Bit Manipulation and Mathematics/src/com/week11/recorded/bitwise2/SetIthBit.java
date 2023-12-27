package com.week11.recorded.bitwise2;

public class SetIthBit {

	public static void main(String[] args) {
		int n=9;int i=2;
int bit=setIthBit(n, i);
System.out.println(bit);

	}

	
	public static int setIthBit(int n,int i) {
		int mask = 1<<i;
		return (n | mask );
	}
	
}
