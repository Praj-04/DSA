package com.practice.hackerRank.Questions;

import java.util.Arrays;

public class RepeatedString {

	public static void main(String[] args) {
		String st="aba";
		int n=100;
int ans= countRepeatedChar(st,n);
System.out.println(ans);
	}

	private static int countRepeatedChar(String st, int n) {
		char[] s = new char[n];
		int count=0;
		
		for(int i=0;i<st.length();i++) {
			int j=i;
			while(j<n) {
				s[j]=st.charAt(i);
				j=j+st.length();
			}
			
		}
		
//		System.out.println(Arrays.toString(s));
		
		for(char c:s) {
			if(c=='a') {
				count++;
			}
		}
		
		return count;
	}

}
