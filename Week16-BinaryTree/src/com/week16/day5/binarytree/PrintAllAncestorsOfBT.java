package com.week16.day5.binarytree;

import java.util.ArrayList;

public class PrintAllAncestorsOfBT {

	public static boolean ancestors(Node root,ArrayList<Integer> ans, int target) {
 
		if(root == null) return false;
		
		if(root.data == target) return true;
		
		boolean isPresentLeft = ancestors(root.left, ans, target);
		boolean isPresentRight = ancestors(root.right, ans, target);
		
		if(isPresentLeft || isPresentRight) {
			ans.add(root.data);
			return true;
			
		}
		return false;
	}

}
