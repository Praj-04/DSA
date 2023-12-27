package com.week8.dummy.template;

public class Dummy {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode n1 = new ListNode(2);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(4);
		ListNode n4 = new ListNode(5);

		head.next = n1; // adding n1's address to head's ref part
		n1.next = n2;
		n2.next = n3;
		n3.next=n4;

		iterate(head);

	}

	public static void iterate(ListNode head) {
		ListNode temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}

}