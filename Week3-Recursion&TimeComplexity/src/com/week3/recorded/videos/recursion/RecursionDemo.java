package com.week3.recorded.videos.recursion;

import java.util.Scanner;

public class RecursionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
//		printNumbers(n);
//		printNumbers1(n);
		bar(n);
	}

	 static void printNumbers(int n) {
		if (n > 0) {
			System.out.print(n+" ");
			printNumbers(n - 1);
		}
	}
	 
	 static void printNumbers1(int n) {
			if (n > 0) {
				printNumbers1(n - 1);
				System.out.print(n+" ");
			}
		}
	 
	 static void bar(int n) {
			if (n > 0) {
				System.out.print(n+" ");
				bar(n - 1);
				bar(n - 1);
			}
		}

}
