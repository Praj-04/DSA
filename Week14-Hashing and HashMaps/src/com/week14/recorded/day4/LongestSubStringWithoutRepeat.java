package com.week14.recorded.day4;

import java.util.HashMap;
import java.util.Map;


//MyCode-Doesnt work properly..logic wrong
public class LongestSubStringWithoutRepeat {

	public static void main(String[] args) {
String s="abcdcbecada";
int length= findlongestLength(s);
System.out.println(length);
	}

	private static int findlongestLength(String s) {
Map<Character,Integer> map=new HashMap<>();

int max=0;

for(int i=0;i<s.length();i++) {
	if(map.containsKey(s.charAt(i))) {
		int stringLength=map.size();
//		System.out.println(stringLength);
		max=Math.max(max, stringLength);
		map.clear();
		map.put(s.charAt(i), 1);
	}else {
		map.put(s.charAt(i), 1);
	}
	
}
max=Math.max(max, map.size());
		
		return max;
	}

}
