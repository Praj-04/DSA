package com.week16.day4.binarytree;

public class DiameterOfBinaryTree {

	//Diameter is the longest path..ie usually it is between 2 leaf nodes
	
		
//		static int diameter(Node root) {
//			if(root==null) return 0;
//			
//			int leftHeight = height(root.left);
//			int rightHeight = height(root.right);
//			int diameterMiddle = leftHeight + rightHeight;
//			
//			int leftDiameter = diameter(root.left);
//			int rightDiameter = diameter(root.right);
//			return  Math.max(Math.max(leftDiameter, rightDiameter), diameterMiddle);
//		}
//		
//		
//		static int height(Node root) {
//			if(root == null) return 0;
//			int hl = height(root.left);
//			int hr = height(root.right);
//			
//			return Math.max(hl, hr)+1;
//		}
	static int diameter=0;
		
		static int height(Node root) {
			if(root == null) return 0;
			int hl = height(root.left);
			int hr = height(root.right);
			diameter=Math.max(diameter, hl+hr);
			return Math.max(hl, hr)+1;
		}
		
	

}
