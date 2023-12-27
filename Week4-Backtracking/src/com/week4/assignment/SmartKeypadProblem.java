package com.week4.assignment;
import java.util.*;

public class SmartKeypadProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "23";
		List<String> answer = letterCombinations(digits);
		for(String s:answer) {
			System.out.println(s);
		}
	}
	
	
	public static List<String> letterCombinations(String digits) {
        //You can code here

String[] a={ "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
List<String> ans= new ArrayList<>();
keyPadHelper(digits,0,ans,a,"");      
return ans;
    }


    static void keyPadHelper(String input,int index,List<String> ans,String[] a,String cur){

if(index == input.length()){
  ans.add(cur);
  return;
}

int indexOfButton = input.charAt(index)-'0'; //take each index from the given input ..eg if digit was ==> 234..we take 2 here

String buttonString = a[indexOfButton]; // for 2 we take corresponding alphabet from array..i.e abc

for(int i=0;i<buttonString.length();i++){
  cur = cur + buttonString.charAt(i);
  keyPadHelper(input,index+1,ans,a,cur);
  cur=cur.substring(0,cur.length()-1); //backtracking
}

    }

}





    
