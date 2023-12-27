package com.week8.recorded.middleNode2;

public class FindMiddleNode {

	public static void main(String[] args) {
Node head= new Node(1);
Node n1= new Node(2);
Node n2= new Node(3);
Node n3= new Node(4);
//Node n4= new Node(5);

head.next=n1;
n1.next=n2;
n2.next=n3;
//n3.next=n4;

Node middle=findMiddleNode(head);
System.out.println(middle.data);
	}
	
	static Node findMiddleNode(Node head) {
		
	Node slow=head;
	Node fast=head;
	
	
	while(fast!=null && fast.next!= null) {
		slow=slow.next;
		fast=fast.next.next;
	}
	return slow;
	
	}

}

class Node {
	int data;
	Node next;

	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}

}