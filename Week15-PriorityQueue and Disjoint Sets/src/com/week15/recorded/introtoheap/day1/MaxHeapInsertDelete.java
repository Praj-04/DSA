package com.week15.recorded.introtoheap.day1;

public class MaxHeapInsertDelete {

	// we will consider a int heap..we can make any type of heaps..

	int a[];
	int capacity; // total elements of the array
	int size; // currently how many elements are present

	public MaxHeapInsertDelete(int capacity) {
		this.capacity = capacity;
		size = 0;
		a = new int[capacity];
	}

	// INSERT
	// TC here is O(logn) ==> we know the eight of heap is logn
	public boolean insert(int e) {
		if (size == capacity) { // all elements have been inserted
			return false;
		}

		// first enter the element
		a[size] = e;

		// find its parent index. check if element entered at the position is greater
		// than its parent
		// if parent is greater,then we have to swap
		int i = size;
		while (i > 0) {
			int parent = (i - 1) / 2;
			if (a[parent] < a[i]) {
				swap(i, parent);
				i = parent; // once swapped..we have to check with above parent also
			} else
				break;
		}
		size++;
		return true;
	}

	// DELETE - while deleting we always delete the top most node
	public  int pop() throws Exception {
		if (size == 0)
			throw new Exception("empty Priority queue");
		size--;
		int temp = a[0]; // store the top node in temp
		a[0] = a[size]; // move the last node to top
		heapify(0); // we have now again make max heap
		return temp;
	}

	private void heapify(int i) {
		if (i >= size)
			return;

		int left = (2 * i) + 1; // find the left node
		int right = (2 * i) + 2; // find right node
		int larger = i; // current top node
		if (left<size && a[left] > a[i]) { // is left greater than top
			larger = left;
		}
		if (right<size && a[right] > a[larger]) { // is right greater than larger
			larger = right;
		}
		if (larger != i) { // top and the larger are different(could be left or right, then swap)
			swap(larger, i);
			heapify(larger);
		}

	}

	public void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void print() {
		for (int i = 0; i < size; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	// DAY 2 ---> HEAP USING ARRAY USING HEAPIFY IN REVERSE DIRECTION

	public void buildHeap(int b[]) {
		if (b.length > capacity)
			return;

		// the given heap b, we put inside the a[] of this code..easy to call already
		// typed heapify code
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
		size = b.length;

		for (int i = size /2; i >= 0; i--) {
			heapify(i); // call heapify from the last index to top in reverse
		}

		// putting element back to b array after heapify in a array
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		
//		for (int i = 0; i < size; i++) {
//			System.out.print(b[i] + " ");
//		}
	}
	
	//DAY2 - HEAPSORT
	//You first meake a heap from the given array
	public void heapSort(int b[]) throws Exception {
		buildHeap(b);
		
		for(int i=b.length-1;i>=0;i--) {
			b[i]=pop();
		}
	}

}
