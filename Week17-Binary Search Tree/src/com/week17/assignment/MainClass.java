package com.week17.assignment;


public class MainClass {

	public static void main(String[] args) {

		Node n1 = new Node(8);
		Node n2 = new Node(3);
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

//FloorInBST f = new FloorInBST();
//System.out.println( f.floor(root, 2));

//CeilInBST c = new CeilInBST();
//System.out.println(c.findCeil(root, 11));


searchInBinaryTree s= new searchInBinaryTree();
Node ans = s.searchBST(root, 10);
inOrderTraversal(ans);
		
		

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
