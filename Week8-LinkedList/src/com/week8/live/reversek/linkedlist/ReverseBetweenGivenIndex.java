package com.week8.live.reversek.linkedlist;

class ListNodeRB {
	int val;
	ListNodeRB next;

	ListNodeRB() {
		val = 0;
		next = null;
	}

	ListNodeRB(int val) {
		this.val = val;
		next = null;
	}

	ListNodeRB(int val, ListNodeRB next) {
		this.val = val;
		this.next = next;
	}
}

public class ReverseBetweenGivenIndex {

	public static void main(String[] args) {
		ListNodeRB head = new ListNodeRB(1);
		ListNodeRB n1 = new ListNodeRB(2);
		ListNodeRB n2 = new ListNodeRB(3);
		ListNodeRB n3 = new ListNodeRB(4);
		ListNodeRB n4 = new ListNodeRB(5);

		head.next = n1; // adding n1's address to head's ref part
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;

		iterate(head);
		int m = 2;
		int n = 4;
		ListNodeRB answer = reverseBetween(head, m, n);
		iterate(answer);
	}

	// 1 2 3 4 5

	public static ListNodeRB reverseBetween(ListNodeRB head, int m, int n) {

		ListNodeRB dummy = new ListNodeRB(-1);
		dummy.next = head;

		ListNodeRB prevTail = dummy;
		ListNodeRB curHead = head;

		int k = n - m;
		int count = 1;

		while (curHead != null && curHead.next != null) {

			if (count == m) {
				System.out.println("The count is" + count);
				ListNodeRB newNode = curHead;
				ListNodeRB nextHead = findTailAfterK(newNode, k);
				System.out.println("next head is");
				iterate(nextHead);

				ListNodeRB ans = reverseList(curHead, k);
				prevTail.next = ans;

				while (nextHead != null) {
					prevTail.next = nextHead;

				}
				prevTail.next = newNode;
				curHead=newNode;

			}

			prevTail.next = curHead;
//			System.out.println(prevTail.val);
			curHead.next = curHead;
			System.out.println(curHead.val);

			++count;

		}
		return dummy.next;

	}

	static ListNodeRB findTailAfterK(ListNodeRB newNode, int k) {

		for (int i = 0; i <= k; i++) {
			newNode = newNode.next;
			if (newNode == null)
				return null;
			System.out.println(newNode.val);
		}

		return newNode;
	}

	public static ListNodeRB reverseList(ListNodeRB temp, int k) {
		int count = 0;
		if (temp == null || temp.next == null)
			return temp;

		ListNodeRB prev = temp;
		ListNodeRB cur = temp.next;

		while (count < k && cur != null) {
			ListNodeRB extra = cur.next;
			cur.next = prev;
			prev = cur;
			cur = extra;
			++count;
			System.out.println("here");
			System.out.println(count);
		}
		return prev;
	}

	public static void iterate(ListNodeRB head) {
		ListNodeRB temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

}
