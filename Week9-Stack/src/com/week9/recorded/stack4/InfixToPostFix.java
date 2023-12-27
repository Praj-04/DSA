package com.week9.recorded.stack4;

import java.util.ArrayDeque;

public class InfixToPostFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String expr = "a + b - d";
		String expr = "a + b - d * ( e + f ) * g";
		System.out.println(infixToPostFix(expr));
	}

	public static boolean isOperator(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
	}

	public static int checkPrecendence(String s) {
		switch (s) {
		case "^":
			return 3;

		case "*":
		case "/":
			return 2;

		case "+":
		case "-":
			return 1;

		default:
			return -1;

		}
	}

	public static String infixToPostFix(String s) {
		String[] tokens = s.split(" ");
		ArrayDeque<String> stack = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();

		for (String token : tokens) {
			if (token.equals("(")) {
				stack.push(token);
			} else if (isOperator(token)) {
				while (!stack.isEmpty() && checkPrecendence(stack.peek()) >= checkPrecendence(token)) {
					String temp = stack.pop();
					sb.append(temp).append(" ");
				}
				stack.push(token);

			} else if (token.equals(")")) {
				while (!stack.isEmpty() && !stack.peek().equals("(")) {
					String temp = stack.pop();
					sb.append(temp).append(" ");
				}
				stack.pop();

			} else { // operand
				sb.append(token).append(" ");
			}
		}

		while (!stack.isEmpty()) {
			String temp = stack.pop();
			sb.append(temp).append(" ");
		}

		return sb.toString();
	}

}
