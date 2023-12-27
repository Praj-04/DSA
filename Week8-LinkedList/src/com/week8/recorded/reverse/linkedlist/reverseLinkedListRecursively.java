package com.week8.recorded.reverse.linkedlist;

public class reverseLinkedListRecursively {

	public static void main(String[] args) {
		Nodes head= new Nodes(1);
		Nodes n1= new Nodes(2);
		Nodes n2= new Nodes(3);
		Nodes n3= new Nodes(4);
		Nodes n4= new Nodes(5);

		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
		 head= reverseLinkedListRecursive(head);
		iterate(head);
	}
	
	public static void iterate(Nodes head) {
		Nodes temp=head;
		while(temp!=null) {
			System.out.print(temp.data +" -> ");
			temp=temp.next;
		}
	}
	
	static Nodes reverseLinkedListRecursive(Nodes head) {
		
		return head;

}
}

class Nodes {
	int data;
	Nodes next;

	public Nodes(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

