package com.week9.recorded.stack1;

public class StackUsingArray {

	private int size;
	private int a[];
	private int top;

	 StackUsingArray(int size) {
		this.size = size;
		a = new int[size];
		top = -1;
	}

	public boolean isEmpty() {
		// can be written as return top==-1;
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == size - 1) {
			return true;
		}
		return false;
	}

	public boolean push(int data) {
		if (isFull()) {
			System.out.println("Stack overflow!!");
			return false;
		} else {
			top++;
			a[top] = data;
			return true;
		}

	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {

			int temp = a[top];
			top--;
			return temp;
		}

	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			return a[top];
		}
	}
	
	
	public void printStack() {
		for(int i=0;i<=top;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}

}
