package com.week17.assignment;

import com.week17.assignment.MainClass.Node;

public class MinAbsoluteDifference {

	
	static int ans;
	  static Node prev;
	    public int getMinimumDifference(Node root) {
	       ans= Integer.MAX_VALUE;
	       prev=null;
	  minAbsDifUtil(root);
	  return ans;
	    }

	    static void minAbsDifUtil(Node root){
	      if(root==null){
	        return;
	              }
	              if(root.left!=null){
	              minAbsDifUtil(root.left);
	              }
	              if(prev!=null){
	                ans=Math.min(ans,root.data - prev.data);
	                              }
	                            
	                              prev=root;

	                              if(root.right!=null){

	                              minAbsDifUtil(root.right);
	                              }
}
}