package com.week7.assignment.arrays1;

public class LongestPrefixInString {

	public static void main(String[] args) {
		
		String[] arg= {"hello","help","heskel"};
		
		String result =  arg[0];
		
		for(int i = 1; i < arg.length; i++){
            // .indexOf() return index of that substring from string.
            while(arg[i].indexOf(result) != 0){
               System.out.println(arg[i].indexOf(result));
                // update matched substring prefx
                result = result.substring(0, result.length()-1);
               System.out.println(result);
                // check for empty case. direct return if true..
                if(result.isEmpty()){
                   System.out.println(-1);
                }
            }
        }
		
//		System.out.println(result);
	}

}
