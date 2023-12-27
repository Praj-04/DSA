package com.week13.assignment.homework.assignment;
import java.util.Arrays;

public class FractionalKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = { 60, 100, 120 };
		int[] weights = { 10, 20, 30 };
		int capacity = 50;
		System.out.println(fractionalKnapsack(values, weights, capacity));
	}

	private static double fractionalKnapsack(int[] values, int[] weights, int capacity) {

		// You can code here
		int[][] items = new int[values.length][2];

		for (int i = 0; i < values.length; i++) {
			items[i][0] = values[i];
		}

		for (int i = 0; i < weights.length; i++) {
			items[i][1] = weights[i];
		}
		Arrays.sort(items, (o1, o2) -> {
			double ratioThis = (double) o1[0] / o1[1];
			double ratioThat = (double) o2[0] / o2[1];

			if (ratioThis > ratioThat)
				return -1;
			if (ratioThat > ratioThis)
				return 1;
			return 0;
		});
		
//		for (int i = 0; i < items.length; i++) {
//            for (int j = 0; j < items[i].length; j++) {
//                System.out.print(items[i][j] + " ");
//            }
//            System.out.println();
//        }

		
		double profit = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i][1] <= capacity) {
				profit += items[i][0];
				capacity -= items[i][1];
			} else {
				double fractionalProfit = (double) (items[i][0] * capacity) / items[i][1];
				profit += fractionalProfit;
				break;
			}
		}
		return profit;

	}
}
