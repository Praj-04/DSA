package com.week8.recorded.reverse.linkedlist;


public class reverseALinkedList3 {

	public static void main(String[] args) {
		Node head= new Node(1);
		Node n1= new Node(2);
		Node n2= new Node(3);
		Node n3= new Node(4);
		Node n4= new Node(5);

		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		 head= reverseLinkedList(head);
		iterate(head);
	}
	
	public static void iterate(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data +" -> ");
			temp=temp.next;
		}
	}
	
	static Node reverseLinkedList(Node head) {
		
		if(head==null||head.next==null) return head;
		
		
		Node prev=head;
		Node cur=head.next;
		
	
		while(cur!=null) {
			Node next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		head.next=null;
		return prev;
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