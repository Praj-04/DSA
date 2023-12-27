package com.week2.recorded.videos;

public class MaxNoInArray {

	public static void main(String[] args) {

		int[] numbers = {23,12,6,7,15,3,56,2};
		int max = Integer.MIN_VALUE;
		
		for(int number:numbers)
		{
			if(number>max) {
				max=number;
			}
		}
		System.out.println(max);
		
	}

}
