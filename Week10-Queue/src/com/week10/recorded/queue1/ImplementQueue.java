package com.week10.recorded.queue1;

public class ImplementQueue {

	public static void main(String[] args) {
		
		
		CircularQueue q = new CircularQueue(4);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.printQueue();
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.enqueue(50);
		
		q.printQueue();
		
//MyQueue q = new MyQueue(4);
//q.enqueue(10);
//q.enqueue(20);
//q.enqueue(30);
//q.enqueue(40);
//q.enqueue(50);
//
//q.printQueue();	
//System.out.println(q.dequeue());
//q.printQueue();
//System.out.println(q.dequeue());
//System.out.println(q.dequeue());
//System.out.println(q.dequeue());
//System.out.println(q.dequeue());
//q.printQueue();
//
//System.out.println(q.enqueue(80));
//q.printQueue();
//System.out.println(q.enqueue(100));
//q.printQueue();
//System.out.println(q.peek());
//
//
//		QueueStackHW qs = new QueueStackHW();
//qs.push(2);
//qs.push(3);
//qs.printQueue();
//qs.pop();
//qs.printQueue();
//qs.push(4) ;
//qs.printQueue();
//qs.pop();
//qs.printQueue();
//
////qs.pop();
////qs.printQueue();
	}

}
