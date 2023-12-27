package com.week2.recorded.videos;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
//		System.out.println(args[0]); // using run configuration -> arguments
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter the numbers");
        int n = sc.nextInt(); 
        int sum=0;
        for(int i=1; i<=n;i++){
         System.out.println("enter number: "+i);
        int x=sc.nextInt();
        sum+=x;
        }
        System.out.println(sum); 
	}

}
