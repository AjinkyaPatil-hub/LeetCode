package com.LeetCode.String.MicroSoftProblem;

public class Solution {
	public static void main(String[] args) {
		String str="aabbaaabbb";	
		 System.out.println(doubleChar(str));
		
	}

	private static StringBuffer doubleChar(String str) {
		int i=0;
		StringBuffer sb = new StringBuffer();
		while(i<str.length()){
			int j = i+1;
			int z = i+2;
			if(str.charAt(i) == str.charAt(j)){
				sb.append(str.charAt(i));
				sb.append(str.charAt(j));
				if(z == str.length() ||str.charAt(j) == str.charAt(z)){
					break;
				}
				i=i+2;
			}else{
				break;
			}
		}
		return sb;
		
	}

}
