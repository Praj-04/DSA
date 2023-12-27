package com.week14.assignment.homework;

import java.util.HashSet;
import java.util.Set;

public class NAmingACompany {

	public static void main(String[] args) {
//		String[] ideas= {"coffee","donuts","time","toffee"};
		
		String[] ideas=	{"s", "ad", "vc", "uz","v","ky","qsg","aby","qgr","qfqho","yvt","opsy","z","e","ojyok","qvav","myc","k","a","lqtm","xcymr","zbfly","qyxp","qq","b","skl","k","kzye","p"};
		System.out.println(distinctNames(ideas));
		

	}

	 public static long distinctNames(String[] ideas) {
	        //You can code here

	Set<String> set = new HashSet<>();

	for(String s:ideas){
	  set.add(s);
	}
	long count=0;

	for(int i=0;i<ideas.length;i++){ //cofee
	  for(int j=0;j<ideas.length;j++){ //donuts  => doffee conuts
	    String ideaA=ideas[i]; // coffee
	    String ideaB=ideas[j]; //donuts
	    String firstName=ideaB.substring(0, 1).concat(ideaA.substring(1,ideaA.length()));
	    System.out.println(firstName);
	    
	    String lastName = ideaA.substring(0,1).concat(ideaB.substring(1,ideaB.length()));
    System.out.println(lastName);
	    if(!set.contains(firstName) && !set.contains(lastName)) {
	    	count++;
    	System.out.println("count is "+ count);
    	System.out.println();
	    }

	  }
	}
return count;
	 }
	 
}
