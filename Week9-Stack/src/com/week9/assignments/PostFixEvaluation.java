package com.week9.assignments;



import java.util.*;

public class PostFixEvaluation
{
	
	public static void main(String[] args) {

		String[] s = {"2","1","+","3","*"};
		int ans=evalPostfix(s);
		System.out.println(ans);
	}
	
    public static int evalPostfix(String[] A)
    {
      ArrayDeque<Integer> stack = new ArrayDeque<>();
      for(String token :A){

if(isOperator(token)){
 int second= stack.pop();
 int first=stack.pop();
 int result=0;

 switch(token){
  case "+" : result = first + second;
  break;

case "-" : result = first - second;
  break;

case "*" : result = first * second;
  break;

case "/" : result = first / second;
  break;

case "^" : result =(int)Math.pow(first,second);
  break;
 }

 stack.push(result);
}else{
  stack.push(Integer.parseInt(token));
}
}
return stack.pop();

      
    }

static boolean isOperator(String s){
return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("^");
}

}