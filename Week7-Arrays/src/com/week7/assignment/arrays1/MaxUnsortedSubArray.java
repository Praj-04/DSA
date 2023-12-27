package com.week7.assignment.arrays1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MaxUnsortedSubArray {

	public static void main(String[] args) {
		
ArrayList<Integer> A = new ArrayList<>(List.of(4 ,2 ,3 ,5 ,1));
		
//		18
//
//		229462 879748 524108 109767 416718 58019 469065 89537 651016 913512 398017 57475 836393 857686 712427 276823 803826 905589
		//ArrayList<Integer> A = new ArrayList<>(List.of(1, 3, 2, 4, 5));
				//ArrayList<Integer> A = new ArrayList<>(List.of(1, 2, 3, 4, 5));
				
//				ArrayList<Integer> A = new ArrayList<>(List.of(4, 3, 2, 5, 1));
//			 ArrayList<Integer> A = new ArrayList<>(List.of(229462, 879748, 524108, 109767, 416718, 58019, 469065, 89537, 651016, 913512 ,398017 ,57475 ,836393 ,857686 ,712427, 276823 ,803826, 905589,5,1,3));
		
		System.out.println(subUnsort(A));

	}
	
	public static ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
	      ArrayList<Integer> ans = new ArrayList<>();
	      
	      ArrayList<Integer> copy = new ArrayList<>();
	      copy.addAll(A);
	      Collections.sort(copy);
	      
	      
	      int start=0;
	      int last=0;
	      
	      for(int i=0;i<A.size();i++) {
	    	  if(A.get(i)!=copy.get(i)) {
	    		  start=i;
	    		  ans.add(start);
	    		  break;
	    	  }
	      }for(int j=A.size()-1;j>=0;j--) {
	    	  if(A.get(j)!=copy.get(j)) {
	    		  last=j;
	    		  ans.add(last);
	    		  break;
	    	  }
	      }
	      
	      if(start==0 && last==0) {
	    	  ans.add(Integer.valueOf(-1));
	      }
	      
	      
	return ans;
	      
	    }

}
