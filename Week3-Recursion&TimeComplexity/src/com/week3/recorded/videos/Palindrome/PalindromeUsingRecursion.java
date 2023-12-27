package com.week3.recorded.videos.Palindrome;

public class PalindromeUsingRecursion {

	public static void main(String[] args) {
		System.out.println(isPalindrome("aabb")); // a cc abba  abcba  

		
	}
	
static boolean isPalindrome(String s) {
	 
	return palindromeHelper(s,0,s.length()-1);
}

 static boolean palindromeHelper(String s, int l, int r) {

	 if(l>=r) return true;
	 
	 if(s.charAt(l)==s.charAt(r)) {
		 return palindromeHelper(s, l+1, r-1);
	 }
	 
	 return false;
}
	
}
