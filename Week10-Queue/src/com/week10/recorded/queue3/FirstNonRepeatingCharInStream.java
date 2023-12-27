package com.week10.recorded.queue3;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingCharInStream {

	public static void main(String[] args) {
String s ="abcbacdabcdeef";
System.out.println(firstNonRepaeatingHelper(s));
	}
	
	
	public static String firstNonRepaeatingHelper(String s) {
		StringBuilder sb = new StringBuilder();
		
		int frequency[] = new int[26];
		
		Queue<Character> q = new LinkedList<>();
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			q.offer(c);
			
		frequency[c-'a']++;
		
		while(!q.isEmpty() && frequency[q.peek()-'a']>1) {
			q.poll();
			}
		
		if(q.isEmpty()) {
			sb.append('#');
		}else {
			sb.append(q.peek());
		}
		}
		return sb.toString();
		
		
	}

}
