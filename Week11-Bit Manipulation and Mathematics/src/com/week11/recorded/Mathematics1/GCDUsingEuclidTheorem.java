package com.week11.recorded.Mathematics1;

public class GCDUsingEuclidTheorem {

	public static void main(String[] args) {

		int a=36;
		int b=20;
		int ans= findGCD(a,b);
		System.out.println(ans);
	}

	private static int findGCD(int a, int b) {

		if(b==0) return a;
		
		return findGCD(b,a%b); 
		
	}

}
