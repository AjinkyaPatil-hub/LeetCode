//https://www.youtube.com/watch?v=9hl2ssw5wgo&list=PLxhNaYPwn9T6s7pnhRs_193ZCO61VNE4_&index=38
package com.LeetCode.minAddMakeValid;

public class Solution {

	public static void main(String[] args) {
		String str="(((";
		System.out.println(minAddMakeValid(str));
	}

	private static int minAddMakeValid(String str) {
		int openBracket=0;
		int closeBracket=0;
		if(str.length()==0)
			return 0;
		
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(str.charAt(i)=='(' || str.charAt(i)== '{'){
				openBracket++;
			}else{
				closeBracket++;
			}
		}
		
		return Math.abs(openBracket-closeBracket);
		
	}
	
}
