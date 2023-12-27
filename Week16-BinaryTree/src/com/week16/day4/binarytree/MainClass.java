package com.week16.day4.binarytree;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		

		Node root = n1;
		n1.right = n2;
		n2.left = n3;
		n3.left = n4;
		n3.right = n5;
		n4.left = n6;
		
	
//		VerticalTraversal v= new VerticalTraversal();
//	System.out.println(	v.verticalOrderTraversal(root));
	
//	VerticalTraversal v= new VerticalTraversal();
//	System.out.println(	v.verticalTraversal(root));
		
		
//		TopViewOfTree t = new TopViewOfTree();
//		System.out.println(t.topViewOfTree(root));
		
		
//		LeftViewOfTree t = new LeftViewOfTree();
//		System.out.println(t.leftViewOfTree(root));
		
		
		DiameterOfBinaryTree d = new DiameterOfBinaryTree();
//		System.out.println(d.diameter(root));
		d.height(root);
		System.out.println(d.diameter);
 		
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