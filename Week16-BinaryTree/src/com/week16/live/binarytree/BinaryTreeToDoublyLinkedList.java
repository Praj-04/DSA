package com.week16.live.binarytree;

public class BinaryTreeToDoublyLinkedList {

	
	static Node convertBinaryTreeToDLL(Node root) {
		if(root==null) return null;
		convertBinaryTreeToDLLUtil(root);
		while(root.left!=null) {
			root=root.left;
		}
		return root;
	}

	private static Node convertBinaryTreeToDLLUtil(Node root) {
		if(root==null) return null;
		
		if(root.left!=null) {
			Node leftRoot = convertBinaryTreeToDLLUtil(root.left);
			while(leftRoot.right!=null) {
				leftRoot=leftRoot.right;
			}
			leftRoot.right=root;
			root.left=leftRoot;
		}
		
		if(root.right!=null) {
			Node rightRoot = convertBinaryTreeToDLLUtil(root.right);
			while(rightRoot.left!= null) {
				rightRoot=rightRoot.left;
			}
			rightRoot.left=root;
			root.right=rightRoot;
		}
		
		return root;
	}
}
