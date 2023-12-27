package com.week10.recorded.queue3;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class getMaxFromQueue {

	
	Queue<Integer> q = new LinkedList<>();
	ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
	
	
	public void enqueue(int data) {
		q.offer(data);
		
		while(!dq.isEmpty() && dq.getLast()<data) {
			dq.pollLast();
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
	
	public int getMax() {
		return dq.getFirst();
	}
	
	
}
