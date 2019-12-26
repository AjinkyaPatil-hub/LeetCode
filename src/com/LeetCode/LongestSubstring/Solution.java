package com.LeetCode.LongestSubstring;

import java.util.HashSet;

public class Solution {
	public static void main(String[] args) {

		String str = "xyzaabdsfab";
		System.out.println(longestNonrepeatingSubstring(str));
	}
	
	private static int longestNonrepeatingSubstring(String str) {
		int a_pointer=0;
		int b_pointer=0;
		int max=0;
		HashSet<Character> hs = new HashSet<>();
		while(b_pointer<str.length()){
			//if character does not present in hs.
			if(!hs.contains(str.charAt(b_pointer))){
				hs.add(str.charAt(b_pointer));
				b_pointer++;
				max = Math.max(hs.size(), max);
			}else{
				//if character present then remove from hs.
				hs.remove(str.charAt(a_pointer));
				a_pointer++;
			}
		}
		return max;
	}
}
