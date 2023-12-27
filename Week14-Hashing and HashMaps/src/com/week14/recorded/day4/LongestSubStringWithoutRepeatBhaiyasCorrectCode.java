package com.week14.recorded.day4;

import java.util.HashMap;
import java.util.Map;

//MyCode-Doesnt work properly..logic wrong
public class LongestSubStringWithoutRepeatBhaiyasCorrectCode {

	public static void main(String[] args) {
		String s = "abcdcbecada";
		int length = findlongestLength(s);
		System.out.println(length);
	}

	private static int findlongestLength(String s) {
		Map<Character, Integer> map = new HashMap<>();

		int l = 0, r = 0;
		int ans=0;
		while (r < s.length()) {
			if (!map.containsKey(s.charAt(r)) || map.get(s.charAt(r)) < l) { // if that char is not present in hashmap
																				// or if the char is already present in
																				// prev window..in that case you will
						ans=Math.max(ans, r-l+1);														// update to new index
			}else {
				l=map.get(s.charAt(r))+1;
			}
			map.put(s.charAt(r), r);
			r++;
		}
		return ans;

	}

}
