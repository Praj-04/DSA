package com.week16.day5.binarytree;

public class DistanceBetweenTwoNodes {

	static int distanceBtwn2Nodes(Node root, int a, int b) {
		Node lca = lca(root, a, b);
		Integer distanceA = distance(root, a);
		Integer distanceB = distance(root, b);
		Integer distanceLCA = distance(root, lca.data);
		return distanceA + distanceB - 2 * distanceLCA;

	}

	static int distanceBtwn2NodesAnotherWay(Node root, int a, int b) {
		Node lca = lca(root, a, b);
				return distance(lca,a) + distance(lca,b);

	}
	
	private static Integer distance(Node root, int a) {
		if (root == null)
			return null;
		if (root.data == a)
			return 0;

		Integer left = distance(root.left, a);
		Integer right = distance(root.right, a);

		if (left == null && right == null)
			return null;
		if (left == null)
			return right + 1;
		if (right == null)
			return left + 1;
		return null;
	}

	private static Node lca(Node root, int a, int b) {
		if (root == null)
			return null;
		if (root.data == a || root.data == b)
			return root;

		Node left = lca(root.left, a, b);
		Node right = lca(root.right, a, b);

		if (left == null)
			return right;
		if (right == null)
			return left;
		return root;
	}
}
