package com.week16.day2.binarytree;

import java.util.ArrayList;

public class CousinsInABinaryTree {

	static int xLevel,yLevel;
	static Node xParent,yParent;
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);

		Node root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		
//		System.out.println(areCousins(root, 4, 6));
		
		
//		ElementsAtDistanceKRecursively ele= new ElementsAtDistanceKRecursively();
//		
//		ArrayList<Integer> ans =new ArrayList<>(); 
//				ele.nodesAtLevelK(root, 2, ans);
//				
//				System.out.println(ans);
		
				ElementsAtDistanceKIteratively element= new ElementsAtDistanceKIteratively();
				System.out.println(element.nodesAtLevelK(root, 2));
	}
	
	static void areCousinsHelper(Node node, Node par, int x,int y, int level) {
		if(node==null) return;
		
		if(node.data==x) {
			xParent=par;
			xLevel=level;
		}
		
		if(node.data==y) {
			yParent=par;
			yLevel=level;
		}
		
		areCousinsHelper(node.left, node, x, y, level+1);
		areCousinsHelper(node.right, node, x, y, level+1);		
	}
	
	static boolean areCousins(Node root,int x,int y) {
		areCousinsHelper(root, null, x, y, 0);
		boolean onSameLevel= xLevel == yLevel;
		boolean differentParent = xParent != yParent;
		return onSameLevel &&  differentParent;
	}
	
	

}


 class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		super();
		this.data = data;
	}
	
	
}