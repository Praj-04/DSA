package com.week3.recorded.videos.josephus;

public class JosephusProblemDemo {

	public static void main(String[] args) {
System.out.println(Demo(3,2)+1);
	}
	
	static int Demo(int n,int k) {
		if(n==1) return 0;
		
		return ((Demo(n-1,k)+k)%n);
	
	}

}
