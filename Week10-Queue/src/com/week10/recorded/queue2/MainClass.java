package com.week10.recorded.queue2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingOneQueue q=new StackUsingOneQueue();
		
	q.push(10);
	q.push(20);
	
	System.out.println(q.pop());
	
	q.push(30);
	System.out.println(q.pop());
	
	q.push(40);
	System.out.println(q.pop());
	System.out.println(q.pop());
	System.out.println(q.pop());
		
		
//		ImplementQueueUsingTwoStacks q = new ImplementQueueUsingTwoStacks();
//		
//		System.out.println(q.dequeue());
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//		q.enqueue(50);
//		System.out.println(q.dequeue());	
//	System.out.println(q.dequeue());	
//	System.out.println(q.dequeue());	
//	q.enqueue(60);
//	q.enqueue(70);
//	System.out.println(q.dequeue());	
//	System.out.println(q.dequeue());	
//	System.out.println(q.dequeue());
//	System.out.println(q.dequeue());	
//	System.out.println(q.dequeue());	
//	
	
	
//	QueueUsingOneStack q = new QueueUsingOneStack();
//	
//	
//	q.enqueue(10);
//	q.enqueue(20);
//	q.enqueue(30);
//	q.enqueue(40);
//	q.enqueue(50);
//	
//System.out.println(q.dequeue());	
//System.out.println(q.dequeue());	
//System.out.println(q.dequeue());	
		
		
	}

}
