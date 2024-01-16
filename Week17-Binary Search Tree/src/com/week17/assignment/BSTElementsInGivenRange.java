package com.week17.assignment;

import java.util.ArrayList;

import com.week17.assignment.MainClass.Node;

public class BSTElementsInGivenRange {

	static ArrayList<Integer> printInRange(Node root,int l,int h){
		ArrayList<Integer> ans = new ArrayList<>();
		findElementsBtwnRange(root, l, h,ans);
		return ans;
	}
	
	public static void findElementsBtwnRange(Node root,int l,int h,ArrayList<Integer> ans) {
		if (root==null) return;
		
		if(root.data>l) {
			findElementsBtwnRange(root.left, l, h,ans);
		}
		if(root.data >=l && root.data<=h) {
			ans.add(root.data);
		}
		
		if(root.data<h) {
			findElementsBtwnRange(root.right, l, h,ans);
		}
		
	}

	
}
