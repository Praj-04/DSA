package com.week15.recorded.introtoheap.day1;

public class PriorityQueueMain {

	public static void main(String[] args) throws Exception {
		MaxHeapInsertDelete mh = new MaxHeapInsertDelete(10);
// DAY1-code
		// mh.insert(5);
//mh.insert(1);
//mh.insert(10);
//System.out.println(mh.pop());
//mh.print();
//
//mh.insert(15);
//mh.insert(20);
//mh.print();
//
//System.out.println(mh.pop());
//mh.print();

//DAY 2 code
		int[] b = { 5, 1, 8, 2, 3, 15 };
//		mh.buildHeap(b);
		mh.heapSort(b);
for(int e:b) {
	System.out.print(e+ " ");
}
		
	}

}
