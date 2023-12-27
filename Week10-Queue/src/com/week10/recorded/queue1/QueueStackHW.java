package com.week10.recorded.queue1;

public class QueueStackHW {

	int front;
    int rear;
    int arr[] = new int[100005];

    QueueStackHW() {
        front = 0;
        rear = 0;
    }

    void push(int a) {
      //You can code here
if(rear>=0){
  arr[rear]=a;
  rear++;
  }else if(rear==arr.length){
return;
  }

    }

    int pop() {
      //You can code here
if(front==rear){
  return -1;
}
else{
  front++;
  return arr[front];
}


    }
    
    public void printQueue() {
    	
    	for(int i=front;i<=rear;i++) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();
    }
}
