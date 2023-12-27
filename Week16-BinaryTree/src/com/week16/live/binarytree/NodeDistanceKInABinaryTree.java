//package com.week16.live.binarytree;
//
//import java.util.List;
//
//public class NodeDistanceKInABinaryTree {
//
//	static void distanceKDown(Node root, int k, List<Integer> ans) {
//		if (root == null || k < 0)
//			return;
//
//		if (k == 0) {
//			ans.add(root.data);
//			return;
//		}
//		distanceKDown(root.left,k-1,ans);
//		distanceKDown(root.right, k-1, ans);
//
//	}
//
//	static List<Integer> distanceKFromTarget(Node root, int target, int k) {
//
//	}
//
//	
//	//return value is the distance of target from the roor node
//	static int distanceKFromTarget(Node root, int target, int k, List<Integer> ans) {
//if(root== null) return -1;
//
//	}
//
//}
