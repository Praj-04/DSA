package com.week13.assignment.homework.assignment;
import java.util.Arrays;

public class FractionalKnapsack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = { 60, 100, 120 };
		int[] weights = { 10, 20, 30 };
		int capacity = 50;
		System.out.println(fractionalKnapsack(values, weights, capacity));
	}

	static class Items{
		  double values,weights;

		  public Items(double values,double weights){
		    this.values=values;
		    this.weights=weights;
		  }
		}

		    public static double fractionalKnapsack(int[] values, int[] weights, int capacity) {
		     //You can code here

		int n=values.length;
		Items[] items = new Items[n];

		for(int i=0;i<n;i++){
		  items[i] = new Items(values[i],weights[i]);
		}

				Arrays.sort(items, (o1, o2) -> {
					double ratioThis = (double) o1.values/o1.weights;
					double ratioThat = (double) o2.values/o2.weights;

					if (ratioThis > ratioThat)
						return -1;
					if (ratioThat > ratioThis)
						return 1;
					return 0;
				});
				
				
				double profit = 0;
				for (int i = 0; i < items.length; i++) {
					if (items[i].weights <= capacity) {
						profit += items[i].values;
						capacity -= items[i].weights;
					} else {
						double fractionalProfit = (double) (items[i].values/ items[i].weights)* capacity ;
						profit += fractionalProfit;
						break;
					}
				}
				return profit;
	}
}
