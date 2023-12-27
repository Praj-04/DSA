package com.week9.assignments;



import java.util.*;
public class ParanthesisUsingStack {
	
	public static void main(String[] args) {
		String exp = "({}[])";  // => true
//		String exp= "()]{}[]) "; ==>false
//		String exp = "(";

		int ans = isBalanced(exp);
		System.out.println(ans);
	}
	
    public static int isBalanced(String A) {
        //You can code here

ArrayDeque<Character> stack = new ArrayDeque<>();

for(int i=0;i<A.length();i++){


  char cur=A.charAt(i);

if(cur=='(' || cur== '[' || cur=='{'){
  stack.push(cur);
}else {
  if(stack.isEmpty()){
    return 0;
  }
  char opening = stack.pop();
  if((opening=='(' && cur ==')') || (opening=='[' && cur ==']') || (opening=='{' && cur =='}') ){
    continue;
  }else {
    return 0;
  }
}

}
return isEmpty(stack);

      
    }


    private static int isEmpty(ArrayDeque s){
      if(s.isEmpty()){
        return 1;
      }return 0;
    }
}