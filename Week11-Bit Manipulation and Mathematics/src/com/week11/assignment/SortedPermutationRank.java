package com.week11.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


// this approach didnt work for large string)..correct solution in SortedPermutationRank2 
public class SortedPermutationRank {

	public static void main(String[] args) {
		String A = "xtc";
		int ans = firstRank(A);
		System.out.println(ans);

	}

	private static int firstRank(String A) {

		String sorted = sortString(A);
		System.out.println(sorted);
		List<String>ans = new ArrayList<>();
		List<String> sA= permute(sorted, 0,sorted.length()-1,ans);
		Collections.sort(sA);
		int count=0;
		int p=0;
	    int m = 1000000007;
			
		for(String q:sA) {
			p=(count++)% m;
			System.out.print(q+" ");
			if(q.contains(A)) {
//				System.out.println("Present" +count);
				break;
			}
		}
		
		
		
	return count;
	}

	
	
	private static List<String> permute(String str, int l, int r,List<String>ans) {
	
		if(l == r) {
			ans.add(str);
//			System.out.println(ans);
//			return ans;
				}
		
		else {
			for(int i=l;i<=r;i++) {
				str=swap(str,l,i);
				permute(str,l+1,r,ans);
				str=swap(str,l,i);
			}
		}
		
		return ans;	
		
	}

	private static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}

	private static String sortString(String a) {
		char[] c = a.toCharArray();
		Arrays.sort(c);
		String s = new String(c);
		return s;

	}

}
