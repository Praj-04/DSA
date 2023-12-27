package com.week9.recorded.stack2;

import java.util.ArrayDeque;

public class ParenthesisUsingStack {

	public static void main(String[] args) {

//		String exp = "({}[])";  // => true
//		String exp= "()]{}[]) "; ==>false
		String exp = "(";

		boolean ans = isItvalidParanthesis(exp);
		System.out.println(ans);
	}

	private static boolean isItvalidParanthesis(String s) {

		ArrayDeque<Character> stack = new ArrayDeque<>();

		for (int i = 0; i < s.length(); i++) {
			
//			if(s.length()==1)return false;

			char cur = s.charAt(i);

			if (cur == '(' || cur == '{' || cur == '[') {
				stack.push(cur);
			} else {
				if (stack.isEmpty()) {
					return false;
				}

				char opening = stack.pop();
				

				if ((opening == '(' && cur == ')') || (opening == '{' && cur == '}')
						|| (opening == '[' && cur == ']')) {
					continue;
				} 
				else {
					
					return false;
				}
				

			}

		}

		return stack.isEmpty();
	}

}
