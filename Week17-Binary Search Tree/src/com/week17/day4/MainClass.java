package com.week17.day4;


public class MainClass {

	public static void main(String[] args) {

		Node n1 = new Node(8);
		Node n2 = new Node(4);
		Node n3 = new Node(10);
		Node n4 = new Node(1);
		Node n5 = new Node(6);
		Node n6 = new Node(14);
		Node n7 = new Node(4);
		Node n8 = new Node(7);

		Node root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		n5.left = n7;
		n5.right = n8;

//		int a[]= {1,3,4,5,6,8,9};
		// ConvertSortedArrayToBST c= new ConvertSortedArrayToBST();
//		Node ans=c.createBalancedBSTfromSortedArray(a, 0, a.length-1);
//		inOrderTraversal(ans);

//		int[] pre = { 8, 5, 1, 7, 10, 12 };
//		createBSTFromPeOrderTraversal c = new createBSTFromPeOrderTraversal();
//		Node ans = c.createBSTFromPreOrderTrav(pre, 0, pre.length - 1);
//		inOrderTraversal(ans);
		
		

	}

	static void inOrderTraversal(Node root) {
		if (root == null)
			return;

		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			super();
			this.data = data;
		}

	}

}
