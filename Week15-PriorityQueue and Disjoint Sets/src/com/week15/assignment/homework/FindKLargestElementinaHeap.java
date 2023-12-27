package com.week15.assignment.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindKLargestElementinaHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,23,12,9,30,2,50};
		int N = 7, k = 3;
System.out.println(kLargest(arr,N,k));
	}
	
	 public static ArrayList<Integer> kLargest(int arr[], int n, int k)
	    {
	      ArrayList<Integer> ans = new ArrayList<>();
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

	for(int i:arr){
	  pq.add(i);
	}


	for(int i=0;i<k;i++){
	  ans.add(pq.poll());
	}
	return ans;
	      
	      }
	

}



//Problem Statement
//
//Given an array of N positive integers, print k largest elements from the array. 
//Example 1:
//
//Input:
//N = 5, k = 2
//arr[] = {12,5,787,1,23}
//Output: 787 23
//Explanation: First largest element in the array is 787 and the second largest is 23.
//Example 2:
//
//Input:
//N = 7, k = 3
//arr[] = {1,23,12,9,30,2,50}
//Output: 50 30 23
//Explanation: Three Largest element in the array are 50, 30 and 23.