package com.week15.assignment.homework;

import java.util.Collections;
import java.util.PriorityQueue;

public class GiftFromRichestPile {

	public static void main(String[] args) {
int[] gifts= {25,64,9,4,100};
int k=4;
System.out.println(pickGifts(gifts, k));
	}
	
	public static long pickGifts(int[] gifts, int k) {
        //You can code here

PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

for(int i=0;i<gifts.length;i++){
  pq.add(gifts[i]);
}
int removed=0;
int add=0;

for(int i=0;i<k;i++) {
	 removed = pq.poll();
	 removed=(int)(Math.floor(Math.sqrt(removed)));
	 pq.add(removed);
		}

long result=0;
for(int i=0;i<gifts.length;i++) {
	 result+= pq.poll();
}

return result;





    }

}
