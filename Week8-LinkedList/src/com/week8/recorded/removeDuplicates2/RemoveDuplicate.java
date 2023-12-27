package com.week8.recorded.removeDuplicates2;

public class RemoveDuplicate {

	public static void main(String[] args) {

		Node<Integer> head = new Node<>(1);
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(2);
		Node<Integer> n3 = new Node<>(2);
		Node<Integer> n4 = new Node<>(3);
		Node<Integer> n5 = new Node<>(3);
		Node<Integer> n6 = new Node<>(3);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;

		Node<Integer> cur = removeDuplicate(head);
		iterateLinkedList(cur);

	}

	public static void iterateLinkedList(Node<Integer> temp) {
		
		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
	}

	static Node<Integer> removeDuplicate(Node<Integer> head) {
		
		Node<Integer> temp = head;
		Node<Integer> cur=head;
		Node<Integer> newHead=null;
		//  1 1 2 2 3 3 3
		
		while(cur!=null) {
			while(cur.next!=null && cur.val==cur.next.val) {
				cur=cur.next;
			}
			if(newHead==null) {
				newHead=temp=cur;
			}else {
				temp.next=cur;
				temp=temp.next;
			}
			cur=cur.next;

	}
		return newHead;

}
}

class Node<E> {
	E val;
	Node<E> next;

	Node(E val) {
		this.val = val;
		this.next = null;
	}

}
