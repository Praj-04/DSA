package com.week7.assignment.arrays1;

public class InterestingArray {

	public static void main(String[] args) {

		int arr[]= {9,17};
		System.out.println(isInteresting(arr));
	}

	 public static int isInteresting(int[] arr)
	    {
	        //You Can Code Here

	int n= arr.length;
	int count =0;

	for(int i=0;i<n;i++){
	  if(arr[i]%2 == 1){
	    count++;
	  }
	}

	if(count%2==0){
	  return 1;
	}else
	{
	  return 0;
	}

	      
	    }
}
