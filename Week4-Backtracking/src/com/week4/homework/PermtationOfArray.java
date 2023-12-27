package com.week4.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PermtationOfArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3,4 };
		List<List<Integer>> answer = permute(nums);
		for (List<Integer> arr : answer) {
			printArray(arr);
		}
	}

	private static List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> answer = new ArrayList<>();
		answer= permuatateHelper(nums, 0, nums.length - 1, answer);
		Collections.sort(answer, new LexicographicalListComparator());
		return answer;

	}

	private static List<List<Integer>> permuatateHelper(int[] nums, int l, int r, List<List<Integer>> answer) {

		if (l == r) {
			List<Integer> a = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				a.add(nums[i]);
			}
			answer.add(a);
		}

		for (int i = l; i <= r; i++) {
			swap(nums, i, l);
			permuatateHelper(nums, l + 1, r, answer);
			swap(nums, i, l);
		}

		return answer;

	}

	private static void swap(int[] nums, int i, int l) {
		int temp = nums[i];
		nums[i] = nums[l];
		nums[l] = temp;

	}

	private static void printArray(List<Integer> a) {
		for (int i : a) {
			System.out.print(i);
		}
		System.out.println();
	}

}

class LexicographicalListComparator implements Comparator <List<Integer>>{

	@Override
	public int compare(List<Integer> o1, List<Integer> o2) {
		int size = Math.min(o1.size(), o2.size());
		for(int i=0;i<size;i++) {
			int cmp=o1.get(i).compareTo(o2.get(i));
			if(cmp!=0) {
				return cmp;
			}
		}
		return Integer.compare(o1.size(), o2.size());
	}

}
