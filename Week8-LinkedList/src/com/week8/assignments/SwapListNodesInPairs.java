package com.week8.assignments;

class ListNodeO {

	int val;
	ListNodeO next;

	ListNodeO() {
		val = 0;
		next = null;
	}

	ListNodeO(int val) {
		this.val = val;
		next = null;
	}

	ListNodeO(int val, ListNodeO next) {
		this.val = val;
		this.next = next;
	}
}

public class SwapListNodesInPairs {

	public static void main(String[] args) {
		ListNodeO head = new ListNodeO(1);
		ListNodeO n1 = new ListNodeO(2);
		ListNodeO n2 = new ListNodeO(3);
		ListNodeO n3 = new ListNodeO(4);
		ListNodeO n4 = new ListNodeO(5);

		head.next = n1; // adding n1's address to head's ref part
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		iterate(head);
		ListNodeO answer = swapPairs(head);

		
		iterate(answer);

	}

	public static void iterate(ListNodeO head) {
		ListNodeO temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static ListNodeO swapPairs(ListNodeO A) {

		ListNodeO temp= A;
		
		while(temp!=null && temp.next!=null){
			int k= temp.val;
			temp.val=temp.next.val;
			temp.next.val=k;
			temp=temp.next.next;
			
			
		}

		return A;

	}
}
