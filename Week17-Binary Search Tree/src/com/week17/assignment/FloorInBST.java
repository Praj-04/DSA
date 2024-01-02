package com.week17.assignment;

import com.week17.assignment.MainClass.Node;

public class FloorInBST {

	
	 public static int floor(Node root, int x) {
	      
	       int floor = -1;
	        while (root != null) {
	            if (root.data == x)
	                return x;
	            else if (root.data < x) {
	                floor = root.data;
	                root = root.right;
	            } else {
	                root = root.left;
	            }
	        }
	        return floor;
	      
	 
	    }
}
