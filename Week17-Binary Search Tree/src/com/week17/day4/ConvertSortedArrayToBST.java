package com.week17.day4;

import com.week17.day4.MainClass.Node;

public class ConvertSortedArrayToBST {

	static Node createBalancedBSTfromSortedArray(int a[], int l, int r) {
		if (l > r)
			return null;

		int m = (l + r) / 2;
		Node root = new Node(a[m]);
		root.left = createBalancedBSTfromSortedArray(a, l, m - 1);
		root.right = createBalancedBSTfromSortedArray(a, m + 1, r);
		return root;

	}
}
