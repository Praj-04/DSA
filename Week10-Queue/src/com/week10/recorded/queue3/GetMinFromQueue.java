package com.week10.recorded.queue3;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class GetMinFromQueue {

	Queue<Integer> q=new LinkedList<>();
	
	ArrayDeque<Integer> dq = new ArrayDeque<>(); // this is an doubly ended queue
	
	
	public void enqueue(int data) {
		q.offer(data);
		
		while(!dq.isEmpty() && dq.getLast()>data) { // if dq is not empty and if the last element in dq is greater than the data 
			dq.pollLast(); // remove the element from last
		}
		dq.offerLast(data);
	}
	
public int dequeue() {
	if(q.isEmpty()) return -1;
	
	
	int temp=q.poll();
	
	if(temp==dq.getFirst()) {
		dq.removeFirst();
	}
	return temp;
}


public int getMin() {
	return dq.getFirst();
}


}
