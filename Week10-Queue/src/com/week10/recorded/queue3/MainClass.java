package com.week10.recorded.queue3;

public class MainClass {

	public static void main(String[] args) {
		
		//getMin
//GetMinFromQueue q = new GetMinFromQueue();
//
//q.enqueue(10);
//
//q.enqueue(20);
//
//System.out.println(q.getMin());
//q.dequeue();
//q.enqueue(15);
//System.out.println(q.getMin());
//q.enqueue(10);
//q.enqueue(5);
//System.out.println(q.getMin());

		//getMax
		
		getMaxFromQueue q = new getMaxFromQueue();

		q.enqueue(10);

		q.enqueue(20);

		System.out.println(q.getMax());
		q.dequeue();
		q.enqueue(15);
		System.out.println(q.getMax());
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.getMax());
		
		
	}

}
