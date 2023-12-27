package com.week7.assignment.arrays1;

import java.util.Arrays;

public class twoSum {

	public static void main(String[] args) {
		int[] ans = new int[2];
	    int[] nums = {1,2,3,4,5};
	    int target = 8;
//	    int nums[] = {3,2,4};
//	    int target = 6;
		  ans=  twoSumHelper(nums,target,0,ans); 
		     System.out.println(Arrays.toString(ans));
	}

	public static int[] twoSumHelper(int[] nums, int target,int startsFrom,int[] ans){



		for(int i=0;i<nums.length-1;i++ ){
		  for(int j=i+1;j<nums.length;j++){
		    if(i>0 && nums[i]==nums[i-1]){
		      i++;
		      continue;
		    }
		    if(j<nums.length-1 && nums[j]==nums[j+1]){
		      j--;
		      continue;
		    }
		    if(nums[i]+nums[j]==target){
		      ans[0]=i;
		      ans[1]=j;
		   return ans ;
		    }
		      }
		  }
		     return ans;
		    }
}
