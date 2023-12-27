package com.week9.recorded.stack3;

import java.util.ArrayDeque;

public class EvaluatingPostfixExpression {

	public static void main(String[] args) {
 
		String exp = "3 4 * 2 5 * ";
		int ans=evaluatePostfix(exp);
		System.out.println(ans);
		
	}

	static int evaluatePostfix(String s) {

		String tokens[] = s.split(" ");

		ArrayDeque<Integer> stack = new ArrayDeque<>();

		for (String token : tokens) {
			if (isOperator(token)) {
				int second = stack.pop();
				int first = stack.pop();
				int result = 0;

				switch (token) {
				case "+":
					result = first + second;
					break;
				case "-":
					result = first - second;
					break;
				case "*":
					result = first * second;
					break;
				case "/":
					result = first / second;
					break;
				case "^":
					result = (int) Math.pow(first, second);
					break;
				}
				stack.push(result);

			} else {
				stack.push(Integer.parseInt(token));
			}

		}
		return stack.pop();
	}

	static boolean isOperator(String s) {
		return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^");
	}

}
