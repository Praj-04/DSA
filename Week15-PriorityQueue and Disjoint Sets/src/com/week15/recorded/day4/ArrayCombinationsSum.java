package com.week15.recorded.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.PriorityQueue;

public class ArrayCombinationsSum {

	public static void main(String[] args) {
Integer[] a = {2,4,1,1};
Integer[] b= {-2,-3,2,4};
int[] ans= combinationsSum(a, b);
System.out.println(Arrays.toString(ans));
	}

	static int[] combinationsSum(Integer a[], Integer b[]) {
		int n = a.length;
		int [] ans = new int [n];
		
		int i=0,j=0;
		//sort given array in reverse order
		Arrays.sort(a,Collections.reverseOrder());
		

		Arrays.sort(b,Collections.reverseOrder());

		PriorityQueue<Data> pq = new PriorityQueue<>((o1,o2)-> o2.sum-o1.sum); //making max heap based on sum
		HashSet<Data> set = new HashSet<>(); // we need only sum with unique index
		
		//we know the 1st element of both array is large,,so we will add that element+ their sum first
				Data firstData = new Data(a[i]+b[j], i,j);
				pq.add(firstData); //(adding 1st largest sum with index  to pq)
				set.add(firstData);//(adding 1st largest sum with index  to hashset also)
				
				
				//now poll elements from pq
				for(int ind=0;ind<n;ind++) {
					Data data= pq.poll();
					ans[ind]=data.sum; // adding the 1st largest sum to result..
					
					i=data.i;
					j=data.j;
					
					//finding the next sum by doing an addition of (i and (j+1)) and (j and (i+1))
					if(j+1<n) {
						Data d1 = new Data(a[i]+b[j+1],i,j+1);
						if(!set.contains(d1)) { // check if those index are already present,if not then they can be new sum
							pq.add(d1);
							set.add(d1);
						}
					}
					
					if(i+1<n) {
						Data d2 = new Data(a[i+1] + b[j],i+1, j);
						if(!set.contains(d2)) { // check if those index are already present,if not then they can be new sum
							pq.add(d2);
							set.add(d2);
						}
						
					}
					
				}
				
			return ans;	
		
		
		
		
	}

	static class Data {
		int sum, i, j;

		public Data(int sum, int i, int j) {
			super();
			this.sum = sum;
			this.i = i;
			this.j = j;
		}

		@Override
		public int hashCode() {
			return Objects.hash(i, j);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Data other = (Data) obj;
			return i == other.i && j == other.j;
		}

	}

}
