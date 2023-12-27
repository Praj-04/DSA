package com.week13.assignment.homework.assignment;

import java.util.Arrays;

public class PatchingArray {

	public static void main(String[] args) {
int a[]= {1,3,12,14};
int n=100;
System.out.println(patchArray(a, n));
	}

	static int patchArray(int[] a, int n) {
		int count = 0;
		Arrays.sort(a);
		int reach = 0;
		int curIndex = 0;
		while (reach < n) {

			if (curIndex < a.length && (reach + 1) < a[curIndex]) {
				System.out.println("New Addition" + (reach + 1));
				count++;
				reach += (reach + 1);
			}else if(curIndex<a.length && (reach+1) >= a[curIndex]) {
				System.out.println("Old Number" +a[curIndex]);
				reach+=a[curIndex];
				curIndex++;
			}
			else {
				System.out.println("New Addition" + (reach + 1));
				reach+= (reach+1);
				count++;
			}
		}
		return count;
	}

}
