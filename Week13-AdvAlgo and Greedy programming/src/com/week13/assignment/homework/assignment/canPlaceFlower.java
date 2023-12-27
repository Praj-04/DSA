package com.week13.assignment.homework.assignment;

public class canPlaceFlower {

	public static void main(String[] args) {
		int[] flower = { 1, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1,
				0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0 };
		System.out.println(canPlaceFlowers(flower, 4));
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		// You can code here

		int flower = 0;
        for(int i = 0; i < flowerbed.length && flower < n; i++) {
            if(flowerbed[i] == 0) {
				int prev = (i == 0) ? 0 : flowerbed[i - 1];
	               int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
               if(next == 0 && prev == 0) {
                   flowerbed[i] = 1;
                   flower++;
               }
            }
        }
        
        return flower == n;
    
	}
}


/*
Can Place Flowers
GreedyArray
AirbnbInfosysMicrosoftTwilio
Problem Statement

You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.
Example 1:

Input:

flowerbed = [1,0,0,0,1], n = 1

Output:

true

Explanation:

In the given flowerbed, there are available empty cells (0s) surrounded by 1s. By planting a flower in the middle cell, we satisfy the condition of having one empty cell between adjacent flowers. Therefore, it's possible to plant 1 flower, and the output is true
Constraints:

    1 <= flowerbed.length <= 2 * 104
    flowerbed[i] is 0 or 1.
    There are no two adjacent flowers in flowerbed.
    0 <= n <= flowerbed.length


*/