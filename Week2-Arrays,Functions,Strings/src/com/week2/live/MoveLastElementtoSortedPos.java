package com.week2.live;

import java.util.Arrays;

public class MoveLastElementtoSortedPos {

	public static void main(String[] args) {

		int[] a = {2,5,6,8,9,4};
		
		for(int i=a.length-1;i>0;i--) {
			if(a[i]<a[i-1]) {
				int temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
