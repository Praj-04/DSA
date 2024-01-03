package com.week11.assignment;

public class DecimalToBinary {

	public static void main(String[] args) {

		System.out.println(toBinary(2));
	}
	
	
	public static String toBinary(int N) {
		//You can code here
String s="";
int index=0;
int[] binary = new int[40];

while(N>0){
  binary[index]=N%2;
  N=N/2;
  index++;
}

 for(int i=index-1;i>=0;i--){
  s+=binary[i];
 }

 return s;
}

}
