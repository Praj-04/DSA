package com.week17.day5.AVL;


public class AVLTree {
	public static void main(String[] args) {
		Node n1 = new Node(50);
		Node n2 = new Node(25);
		Node n3 = new Node(60);
		Node n4 = new Node(20);
		Node n5 = new Node(30);
		Node n6 = new Node(15);
		Node n7 = new Node(70);
		Node n8 = new Node(21);
		Node n9 = new Node(59);

		Node root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n4.left = n6;
		n4.right=n8;
		n3.right = n7;
		n3.left=n9;

		inOrderTraversal(root);
		System.out.println();
		insertAVL(root, 18);
		inOrderTraversal(root);
	}
	
	static void inOrderTraversal(Node root) {
		if (root == null)
			return;

		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}

//height at every node
	static int height(Node a) {
		int heightLeft = (a.left == null ? 0 : a.left.height);
		int heightRight = (a.right == null ? 0 : a.right.height);
		return Math.max(heightLeft, heightRight) + 1;
	}

	static Node leftRotate(Node x) {
		Node y = x.right;
		Node A = y.left;

		y.left = x;
		x.right = A;

		x.height = height(x);
		y.height = height(y);

		return y;
	}

	static Node rightRotate(Node x) {
		Node y = x.left;
		Node B = y.right;

		y.right = x;
		x.left = B;

		x.height = height(x);
		y.height = height(y);

		return y;

	}

	static Node insertAVL(Node root, int key) {
		if (root == null) {
			return new Node(key);
		}

//inserting new node at the bottom
		if (key < root.data) {
			root.left = insertAVL(root.left, key);
		}

		else if (key > root.data) {
			root.right = insertAVL(root.right, key);
		} else {
			return root;
		}

//correcting the position of node
		root.height = height(root);
		int heightBalance = height(root.left) - height(root.right);

//left-left case
		if (heightBalance > 1 && key < root.left.data) {
			return rightRotate(root);
		}

//right-right case
		if (heightBalance < -1 && key > root.right.data) {
			return leftRotate(root);
		}

//left-right
		if (heightBalance > 1 && key > root.left.data) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

//right-left
		if (heightBalance < -1 && key < root.right.data) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	static class Node {
		int data, height; // used height to keep track at every node
		Node left, right;

		public Node(int data) {
			super();
			this.data = data;
		}

	}
}
