package com.week8.assignments;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		ListNodeMS l1 = new ListNodeMS(-10);
		ListNodeMS n1 = new ListNodeMS(20);
		ListNodeMS n2 = new ListNodeMS(40);

		ListNodeMS l2 = new ListNodeMS(-1);
		ListNodeMS n3 = new ListNodeMS(1);
		ListNodeMS n4 = new ListNodeMS(50);
		ListNodeMS n5 = new ListNodeMS(60);

		l1.next = n1; // adding n1's address to head's ref part
		n1.next = n2;

		l2.next = n3;
		n3.next = n4;
		n4.next = n5;

		ListNodeMS answers = mergeTwoLists(l1, l2);

		iterate(answers);

	}

	public static ListNodeMS mergeTwoLists(ListNodeMS l1, ListNodeMS l2) {

		ListNodeMS dummy = new ListNodeMS(-1);
		ListNodeMS tail=dummy;
		
		
		while(true) {
			if(l1==null) {
				
				tail.next=l2;
				break;
				
			}
			
			if(l2==null) {
				tail.next=l1;
				break;
			}
			
			if(l1.val<=l2.val) {
				tail.next=l1;
				l1=l1.next;
			}
			else {
				tail.next=l2;
				l2=l2.next;
			}
			
			tail=tail.next;
		}
		
		
		return dummy.next;

	}

	public static void iterate(ListNodeMS head) {
		ListNodeMS temp = head;

		while (temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
	}

}

class ListNodeMS {
	int val;
	ListNodeMS next;

	ListNodeMS(int val) {
		this.val = val;
		this.next = null;
	}
}
