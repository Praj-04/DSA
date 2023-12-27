package com.week13.recorded.majority.knapsack;

import java.util.Arrays;

public class FractionalKnapsack {

	// in some compilers you will not be able to make changes to the given class
	// like adding comparable Interface
	// In that case you will have to use the comparator.

	static class Item {
//	class Item implements Comparable<Item> {
		int value;
		int weight;

		public Item(int value, int weight) {
			this.value = value;
			this.weight = weight;
		}

		// cant implement below method if you cant edit the given class using comparable
		// In that case use comparator using lambda expression..see below knapsack function
//		@Override
//		public int compareTo(Item that) {
//			double ratioThis = (double) this.value / this.weight;
//			double ratioThat = (double) that.value / that.weight;
//
//			// if compareTo returns > 0 , this is greater
//			// if compareTo returns < 0 , that is greater
//			// if compareTo returns = 0 , that and this is equal
//
//			// return in increasing order
////			if(ratioThis>ratioThat) {
////				return 1;
////			}
////			if(ratioThat>ratioThis) {
////				return -1;
////			}
////			return 0;
//
//			// return in desc order
//			if (ratioThis > ratioThat) {
//				return -1;
//			}
//			if (ratioThat > ratioThis) {
//				return 1;
//			}
//			return 0;
//
//		}

	}

	static double fractionalKnapsack(Item items[],int capacity) {

		Arrays.sort(items, (o1, o2) -> {
			double ratioThis = (double) o1.value / o1.weight;
			double ratioThat = (double) o2.value / o2.weight;
			if (ratioThis > ratioThat) {
				return -1;
			}
			if (ratioThat > ratioThis) {
				return 1;
			}
			return 0;

		});

		double profit =0;
		for(int i=0;i<items.length;i++) {
			if(items[i].weight <= capacity) {
				profit+=items[i].value;
				capacity -= items[i].weight;
			}else {
				double fractionalProfit  =(double) (items[i].value * capacity)/items[i].weight;
				profit += fractionalProfit;
				break;
			}
		}
		
		return profit;
		
		
	}

	public static void main(String[] args) {

		Item i1= new Item(60,10);
		Item i2= new Item(100,20);
		Item i3= new Item(120,30);
		
		int capacity = 50;
		
		Item items[] = {i1,i2,i3};
		System.out.println(fractionalKnapsack(items, capacity));
		
	}

}
