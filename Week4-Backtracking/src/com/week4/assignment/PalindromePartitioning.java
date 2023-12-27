package com.week4.assignment;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {

		String s = "abbaca";
		List<List<String>> ans= palindromePartitioning( s);
		for(List<String> list:ans) {
			for(String a:list) {
				System.out.print(a+ " ");
			}
			System.out.println();
		}
	}
	
	static List<List<String>> palindromePartitioning(String s){
		List<List<String>> ans = new ArrayList<>();
		palindromeHelper(s,ans , 0, new ArrayList<>());
		return ans;
	}
	
	static boolean isPalindrome(String s, int l,int r) {
		while(l<=r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
	
	
	
	static void palindromeHelper(String s,List<List<String>> ans, int index,List<String> cur) {
		if(index == s.length()) {
			List<String> copyCur = new ArrayList<>(cur);
			ans.add(copyCur);
			return;
		}
		
		for(int i=index;i<s.length();i++) {
			if(isPalindrome(s, index, i)) {
				cur.add(s.substring(index,i+1));
				palindromeHelper(s, ans, i+1, cur);
				cur.remove(cur.size()-1);
				
			}
		}
		
	}
	

}
