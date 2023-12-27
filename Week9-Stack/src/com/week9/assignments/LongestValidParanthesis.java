package com.week9.assignments;

import java.util.Stack;

public class LongestValidParanthesis {

	public static void main(String[] args) {
		String s = "())()()()";
		int ans = findLength(s);
		System.out.println(ans);

	}

	private static int findLength(String s) {
		Stack<Integer> st = new Stack<Integer>();
		int max = 0;
		int leftBoundary = -1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				st.push(i);
			} else {
				if (st.isEmpty()) {
					leftBoundary = i;
				} else {
					st.pop();
					if (st.isEmpty()) {
						max = Math.max(max, i - leftBoundary);
					} else {
						max = Math.max(max, i - st.peek());
					}
				}
			}
		}
		return max;
	}

}
