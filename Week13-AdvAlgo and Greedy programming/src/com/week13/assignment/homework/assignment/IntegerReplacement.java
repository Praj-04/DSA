package com.week13.assignment.homework.assignment;

public class IntegerReplacement {

	public static void main(String[] args) {
		int no = 124;
		System.out.println(findOperations(no));
	}

	private static int findOperations(int N) {
		int count = 0;
		while (N > 1) {
			if (N % 2 == 0) {
				System.out.println("Even N is" + N);
				N = N / 2;
				count++;
				System.out.println("Count in even is" + count);
				System.out.println();
			} else {
				long left=(N-1)/2;
				if(left==1 || left%2==0) {
					N=N-1;
					count++;
				}else {
					N=N+1;
					count++;
				}
			}
		}
		return count;

	}

}
