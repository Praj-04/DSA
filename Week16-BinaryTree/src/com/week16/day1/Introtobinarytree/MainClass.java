package com.week16.day1.Introtobinarytree;

public class MainClass {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(4);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(7);
		Node n6 = new Node(5);

		Node root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
 
//		inOrder(root);
//		
//		System.out.println();
//		
//		preOrder(root);
//		
//		System.out.println();
//	
//		postOrder(root);
//		
//		System.out.println();
		
//		System.out.println(minimumInTree(root));'
		
		System.out.println(height(root));
		
		}
	
	static void inOrder(Node root) {
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+ " "); 
		inOrder(root.right);
	}
	
	static void preOrder(Node root) {
		if(root==null) return;
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	static void postOrder(Node root) {
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
 	}
	
	static int minimumInTree(Node root) {
		if(root == null) return Integer.MAX_VALUE;
		int minFromLeft = minimumInTree(root.left);
		int minFromRight= minimumInTree(root.right);
		return Math.min(Math.min(minFromLeft, minFromRight),root.data);
	}
	
	static int height(Node root) {
		if(root==null) return 0;
		
		int h1 = height(root.left);
		int hr= height(root.right);
		return Math.max(h1, hr)+1;
	}
	
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		super();
		this.data = data;
	}

}