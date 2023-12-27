package com.week8.assignments;

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
//		iterate(answer);
	}

	public static void iterate(ListNodeRB head) {
		ListNodeRB temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static ListNodeRB reverseBetween(ListNodeRB A, int m, int n) {
		// You can code here
		int countStart = m;
		int countNumbers = n - m;
		ListNodeRB temp = A;
		ListNodeRB prev=null;;
		ListNodeRB here = A;
		int count = 1;
		while (temp != null && temp.next != null) {
			if (count == countStart) {
				
				System.out.println(count);
				System.out.println(countNumbers);
				ListNodeRB reversedList = reverseList(countNumbers, here);
				System.out.println("rev ans");
				iterate(reversedList);
				System.out.println(temp.val);
				prev.next = reversedList;
				while (reversedList != null) {
					prev = prev.next;
				}
			}
			System.out.println("Firstvalue");
			prev.next=temp;
			temp = temp.next;
			System.out.println(temp.val);
			here = temp;
			count++;
		}
		System.out.println("A answer is ");
		iterate(A);
		return A;
	}

	public static ListNodeRB reverseList(int countNumbers, ListNodeRB here) {
		System.out.println("inside rev");
		System.out.println(countNumbers);
		iterate(here);
		int count = 1;

		if (here == null || here.next == null)
			return here;

		ListNodeRB prev = here;
		ListNodeRB cur = here.next;
		while (count <= countNumbers) {
			ListNodeRB extra = cur.next;
			cur.next = prev;
			prev = cur;
			cur = extra;
			++count;
		}
		here.next = null;
		iterate(prev);
		return prev;
	}

}
