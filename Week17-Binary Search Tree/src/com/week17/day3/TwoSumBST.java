package com.week17.day3;

import java.util.ArrayDeque;

import com.week17.day3.MainClass.Node;

public class TwoSumBST {

	static boolean twoSumBST(Node root, int target) {

		Node cur1 = root, cur2 = root;
		boolean done1 = false, done2 = false;
		int val1 = 0, val2 = 0;
		ArrayDeque<Node> s1 = new ArrayDeque<>();
		ArrayDeque<Node> s2 = new ArrayDeque<>();

		while (true) {
			// traverse in LNR
			while (done1 == false) {
				if (cur1 != null) {
					s1.push(cur1);
					cur1 = cur1.left;
				} else {
					if (s1.isEmpty()) {
						done1 = true;
					} else {
						Node pop = s1.pop();
						val1 = pop.data;
						cur1 = pop.right;
						done1 = true;
					}
				}
			}

			// traverse in RNL
			while (done2 == false) {
				if (cur2 != null) {
					s2.push(cur2);
					cur2 = cur2.right;
				} else {
					if (s2.isEmpty()) {
						done2 = true;
					} else {
						Node pop = s2.pop();
						val2 = pop.data;
						cur2 = pop.left;
						done2 = true;
					}

				}

			}

			// if both done1 and done2 are true
			if (val1 != val2 && val1 + val2 == target) { // you found the 2 nos
				return true;
			} else if (val1 + val2 < target) { // if sum less than target..move left pointer forward
				done1 = false;
			} else if (val1 + val2 > target) {// if sum greater than target..move right pointer backward
				done2 = false;
			}

			if (val1 >= val2) { // if left pointer and right pointer have crossed each other
				return false;
			}

		}
	}

}
