package com.week3.recorded.videos.countoccuranceofstring;

public class CountOccuranceOfString {

	public static void main(String[] args) {

		String s = "ababab";
		String target ="aba";
		System.out.println(countOccurance(target,s));
		
	}

static int countOccurance(String target, String s) {
		// TODO Auto-generated method stub
		return countOccuranceHelper(target,s, 0);
	}

 static int countOccuranceHelper(String target, String s, int i) {
	
	 if(i>s.length()-target.length()) return 0;
	 
	int subProbAns=countOccuranceHelper(target, s, i+1);
	
	boolean doStringCharsMatch= s.substring(i,i+target.length()).equals(target);
	
	if(doStringCharsMatch) return subProbAns +1;
	else 
	return subProbAns;
}

}
