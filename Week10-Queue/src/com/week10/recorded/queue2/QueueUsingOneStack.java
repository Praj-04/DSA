package com.week10.recorded.queue2;

import java.util.ArrayDeque;

public class QueueUsingOneStack {

	ArrayDeque<Integer> s = new ArrayDeque<>();

	void enqueue(int data) {
		s.push(data);
	}

	int dequeue() {
		if (s.isEmpty())
			return -1;

		if (s.size() == 1)
			return s.pop();

		int top = s.pop();
		int ans = dequeue();
		s.push(top);
		return ans;
	}

}
