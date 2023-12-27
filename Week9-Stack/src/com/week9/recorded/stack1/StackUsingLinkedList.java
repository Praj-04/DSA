package com.week9.recorded.stack1;

public class StackUsingLinkedList {
	
	Node head;
	
	boolean isEmpty() {
		if(head==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	void push(int data) {
		Node newNode = new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			int temp=head.data;
			head=head.next;
			return temp;
			
		}
	}
	
	
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
		
			return head.data;
 			
		}
	}
	
	
	
	
	private class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
		}
	}

}
