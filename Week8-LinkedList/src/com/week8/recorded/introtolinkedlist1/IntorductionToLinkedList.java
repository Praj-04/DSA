 package com.week8.recorded.introtolinkedlist1;

public class IntorductionToLinkedList {

	public static void main(String[] args) {

		Node<Integer> head = new Node<>(1);  //===> this will be head node..start point.
		Node<Integer> n1 = new Node<>(2);
		Node<Integer> n2 = new Node<>(3);
		Node<Integer> n3 = new Node<>(4);
		
		//here we have created 4 different nodes in diff locations in memory..they have value set but their reference is null.
		//which means they are not connected to eACH OTHER
		
		//lets add address for next node to reference of particular node
		head.next=n1; // adding n1's address to head's ref part
		n1.next=n2;
		n2.next=n3;
		//n3 ref will hold null,it is the last node
		
		//iterateLinkedList(head);
		head = insertInLinkedList(2, 10, head);
		iterateLinkedList(head);
		
	}
	
	
	public static void iterateLinkedList(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.val +" -> ");
			temp=temp.next;
		}
	}
	
	public static Node<Integer> insertInLinkedList(int pos, int data, Node<Integer> head){
		
		Node<Integer> newNode=new Node<>(data); //created an new node in heap memory
		
		//if new node has to be added in the first
		if(pos==0) {
			newNode.next=head;
			return newNode;
		}
		Node<Integer> temp=head;
		
		for(int i=0;i<pos-1;i++) {
			temp=temp.next; 
			
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
		
	}
	
	public static Node<Integer> deleteFromLinkedList(int pos,Node<Integer> head){
		if(pos==0) {
			return head.next; 
		}
		
		Node<Integer> temp = head;
		for(int i=0;i<pos-1;i++) {
			temp=temp.next;
		}
		
		temp.next=temp.next.next;
	return head;
	}
	
	
}
	
//Creating new node, we made it generic class because we are not sure what type of data ..we may store int or char or string... 
	class Node<E>{
		E val;
		Node<E> next;
		
		Node(E val){
			this.val=val;
			this.next= null; 
		}
	
}
