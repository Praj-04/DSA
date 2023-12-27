package com.week10.recorded.queue2;

import java.util.ArrayDeque;

public class ImplementQueueUsingTwoStacks {

	private ArrayDeque<Integer> s1 = new ArrayDeque<>();
	private ArrayDeque<Integer> s2 = new ArrayDeque<>();

	public void enqueue(int data) {
		s1.push(data);
	}

	public int dequeue() {
		if (s1.isEmpty() && s2.isEmpty()) {
			System.out.println("No elements to pop");
			return -1;
		}
		
		if(!s2.isEmpty()) {
			return s2.pop();
		}
		
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2.pop();
		
	}
}
