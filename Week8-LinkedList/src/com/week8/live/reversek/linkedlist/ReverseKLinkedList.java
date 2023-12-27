package com.week8.live.reversek.linkedlist;

public class ReverseKLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);

		head.next = n1; // adding n1's address to head's ref part
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
iterate(head);
		int k = 3;
		Node answer = reverseKGroups(head, k);

		iterate(answer);

	}

	public static Node reverseKGroups(Node head, int k) {

		Node dummy = new Node(-1);
		dummy.next = head;

		Node prevTail = dummy;
		Node curHead = head;

		while (curHead != null) {
			Node curTail = findTailAfterK(curHead, k);
			if (curTail == null)
				break;
			Node nextHead = curTail.next;
			reverseKTimes(curHead, k);
			prevTail.next = curTail;
			prevTail = curHead;
			curHead = nextHead;
		}

		prevTail.next = curHead;
		return dummy.next;

	}

	static Node findTailAfterK(Node head, int k) {
		for (int i = 0; i < k - 1; i++) {
			head = head.next;
			if (head == null)
				return null;

		}
		return head;
	}

	public static Node reverseKTimes(Node head, int k) {
		if (head == null || head.next == null)
			return head;

		Node prev = null;;
		Node cur = head;
		int count = 0;
		while (count < k && cur != null) {
			Node next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
			count++;
		}
		return prev;

	}

	public static void iterate(Node head) {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

}

class Node {
	int val;
	Node next;

	Node(int val) {
		this.val = val;
		this.next = null;
	}

}