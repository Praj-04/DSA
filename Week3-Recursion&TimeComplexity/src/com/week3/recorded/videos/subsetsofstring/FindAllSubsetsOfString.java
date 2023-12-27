package com.week3.recorded.videos.subsetsofstring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllSubsetsOfString {
	
	public static void main(String[] args) {
		
		String s = "abc";
		List<String> value= new ArrayList<String>();
		
		subStringHelper(s,0,"",value);
		Collections.sort(value);
		value.remove(0);
		for (String v : value) {
			System.out.println(v);
		}
		
		
		}
	
	
	
	
	 static void subStringHelper(String s, int i,String cur,List<String> value) {
		
		 
		 if(i==s.length()) {
			  value.add(cur);
			  		 
			
			  return ;
		 }
		 subStringHelper(s, i+1, cur+s.charAt(i),value);
		 subStringHelper(s, i+1, cur,value);
		 
		 
	}

}
