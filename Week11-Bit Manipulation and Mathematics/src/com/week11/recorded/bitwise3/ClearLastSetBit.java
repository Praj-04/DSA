package com.week11.recorded.bitwise3;

public class ClearLastSetBit {

	public static void main(String[] args) {
System.out.println(clearLastSetBit(26));
		
	}
	static int clearLastSetBit(int n) {
		return n&(n-1);
	}

}
