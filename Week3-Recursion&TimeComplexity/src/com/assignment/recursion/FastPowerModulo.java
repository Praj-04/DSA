package com.assignment.recursion;

public class FastPowerModulo {

	public static void main(String[] args) {
		System.out.println(myPow(2.00000,10,50));
	}
	
	public static double myPow(double x, int n, int p) {

	      if(n==0) return 1;
	      if(x==0) return 0;
	   
	             if(n<0) return myPow(1/x ,Math.abs(n),p);

	      if(n%2==0){
	        return myPow((x%p * x%p)%p,(n/2),p) %p;
	      }
	      else{
	        return (x%p * myPow(x%p,(n-1),p))%p;
	      }

	}
}
