package com.week16.day3.binarytree;

import java.util.ArrayList;
import java.util.List;

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
 		
//		RightViewOfBinaryTree r = new RightViewOfBinaryTree();
//		ArrayList<Integer> ans= new ArrayList<>();
//		r.rightView(root,0,ans);
//		System.out.println(ans);
//		
		
		
		LevelOrderTraversalBFS l=new LevelOrderTraversalBFS();
//		System.out.println(l.printLevelWiseNodes(root));
		System.out.println(l.printLevelWiseNodes3(root));
		
		
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