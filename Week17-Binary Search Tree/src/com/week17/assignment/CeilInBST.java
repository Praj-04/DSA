package com.week17.assignment;

import com.week17.assignment.MainClass.Node;

public class CeilInBST {

	
	public static int findCeil(Node root, int key) {
		  int ceil=-1;
		    while(root!=null){
		      if(root.data==key){
		      return key;
		      }
		      else if(root.data > key){
		        ceil=root.data;
		        root=root.left;
		      }else{
		        root=root.right;
		      }
		    }
		    return ceil;
	 
	    }
}
