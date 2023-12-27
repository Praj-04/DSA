package com.week15.assignment.homework;

import java.util.PriorityQueue;

public class MinCostOfRopes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long[] arr= {4, 3, 2, 6};
int n= arr.length;
System.out.println(minCost(arr, n));
	}
	
	public static long minCost(long arr[], int n) 
    {
PriorityQueue<Long> pq = new PriorityQueue<>();


for(int i=0;i<n;i++){
  pq.add(arr[i]);
}

long cost=0,firstRope=0,secondRope=0,addBack=0;
while(pq.size()>1){
  firstRope= pq.poll();
   secondRope=pq.poll();
  addBack= firstRope+secondRope;
  pq.add(addBack);
   cost+=addBack;
  
}
return cost;

        
    }

}
