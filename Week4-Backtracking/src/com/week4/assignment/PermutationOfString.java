package com.week4.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationOfString {

	public static void main(String[] args) {

		
		String s="ABC";
		List<String> ans=permute(s);
		
				
		System.out.println("Printing the array");
		for(String arr:ans) {
			System.out.println(arr);
		}
		
	}
	
	
	
	 public static List<String> permute(String str) {

		   List<String> answer = new ArrayList<>();
		    
		          permuteHelper(str,0,str.length()-1,answer);
		      Collections.sort(answer);
		      
		return answer;
		          
		    }

		  static void permuteHelper(String str,int l,int r,List<String> answer ){

		    if(l==r && !answer.contains(str)){
		      // Set<String> set = new HashSet<>();
		      // set.add(str);
		      // answer.addAll(set);
		      answer.add(str);
		      return;
		      }
		         
		    for(int i=l;i<=r;i++){
		     str= swap(str,i,l);
		      permuteHelper(str,l+1,r,answer);
		     str= swap(str,i,l);
		    }
		     // return answer;
		  }

		  static String swap(String str,int i,int j){
		    char ch[] = str.toCharArray();
		        char temp = ch[i];
		        ch[i] = ch[j];
		        ch[j] = temp;
		    return String.valueOf(ch);
		  }

}
