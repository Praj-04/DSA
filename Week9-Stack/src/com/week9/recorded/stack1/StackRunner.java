package com.week9.recorded.stack1;

public class StackRunner {

	public static void main(String[] args) {

//		StackUsingArray stack = new StackUsingArray(4);
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.peek( ));
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop( ));
		}
//		System.out.println();
		stack.push(10);
		
		
//	System.out.println(stack.pop( ));
		
		
		
		
//		//iterating over a stack
//		while(!stack.isEmpty()) {
//			System.out.println(stack.pop( ));
//		}

//		stack.printStack();
//
//		System.out.println(stack.peek());
//		stack.printStack();
//
//		
//		stack.pop();
//
//		stack.printStack();
	}

}
