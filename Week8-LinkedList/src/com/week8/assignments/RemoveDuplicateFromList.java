package com.week8.assignments;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {

		Node<Integer> head = new Node<>(1);
		Node<Integer> n1 = new Node<>(1);
		Node<Integer> n2 = new Node<>(2);
		Node<Integer> n3 = new Node<>(3);
		Node<Integer> n4 = new Node<>(3);
//		Node<Integer> n5 = new Node<>(3);
//		Node<Integer> n6 = new Node<>(4);

		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
//		n4.next = n5;
//		n5.next = n6;

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
		Node<Integer> dummy = new Node<>(0);

		dummy.next = head;
		Node<Integer> prev = dummy;
		Node<Integer> cur = head;
		
		while (cur != null) {

			while (cur.next != null && prev.next.val == cur.next.val) 
				cur = cur.next;
				if (prev.next == cur) 
					prev = prev.next;
				else
					prev.next = cur.next;

				cur = cur.next;

			}
			head = dummy.next;
		
			return head;

		
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
