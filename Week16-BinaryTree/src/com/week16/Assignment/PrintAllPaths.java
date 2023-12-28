package com.week16.Assignment;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPaths {

	public static void main(String[] args) {
		Nodes n1 = new Nodes(1);
		Nodes n2 = new Nodes(2);
		Nodes n3 = new Nodes(3);
		Nodes n4 = new Nodes(8);
		Nodes n5 = new Nodes(10);
		Nodes n6 = new Nodes(9);
		Nodes n7 = new Nodes(-3);

		Nodes root = n1;
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;

		System.out.println(binaryTreePaths(root));

	}

	public static List<String> binaryTreePaths(Nodes root) {
		// You can code here

		List<String> ans = new ArrayList<>();
		String s = "";
		binaryPathsUtil(root, ans, s);
		return ans;

	}

	public static void binaryPathsUtil(Nodes root, List<String> ans, String s) {

		if (root == null)
			return;
		s += root.data;

		if (root.left == null && root.right == null) {
			ans.add(s);
			return;
		}
		s += "->";

		if (root.left != null) {
			binaryPathsUtil(root.left, ans, s);
		}
		if (root.right != null) {
			binaryPathsUtil(root.right, ans, s);
		}

	}

}

class Nodes {
	int data;
	Nodes left;
	Nodes right;

	public Nodes(int data) {
		super();
		this.data = data;
	}
}
