package com.practice.hackerRank.Questions;

public class RepeatedStringOptimalApproach {

	public static void main(String[] args) {
		String st="aba";
		int n=100;
long ans= countRepeatedChar(st,n);
System.out.println(ans);
	}

	private static long countRepeatedChar(String st, int n) {
		long stLength=st.length();
		long quotient=0,remainder=0;
		quotient=n/stLength;
		remainder=n%stLength;
		
		long partialStrLen=(remainder==0)? 0 :remainder;
		
		long count= quotient * getLetterCount(st,stLength) + getLetterCount(st, partialStrLen);
		return count;
	}

	private static long getLetterCount(String st, long stLength) {
		long count=0;
		
		for(int i=0;i<stLength;i++) {
			if(st.charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}

}
