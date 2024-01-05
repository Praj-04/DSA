package com.week17.day4;

import com.week17.day4.MainClass.Node;

public class createBSTFromPeOrderTraversal {

	static Node createBSTFromPreOrderTrav(int a[], int l, int r) {
		if (l > r)
			return null;
		Node root = new Node(a[l]);

		int i = l + 1;
		for (; i <= r; i++) {
			if (a[i] > a[l])
				break;
		}
		root.left = createBSTFromPreOrderTrav(a, l + 1, i - 1);
		root.right = createBSTFromPreOrderTrav(a, i, r);
		return root;

	}
}
