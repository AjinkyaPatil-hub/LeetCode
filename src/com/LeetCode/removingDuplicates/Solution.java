package com.LeetCode.removingDuplicates;

import java.util.Iterator;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
		String str = "ababcs";
		removeDuplicateAndArrangeInAsc(str);

	}

	private static String removeDuplicateAndArrangeInAsc(String str) {

		if (str == null || str.length() < 1)
			return null;

		String res = "";
		TreeSet<Character> ts = new TreeSet<>();
		for (int i = 0; i < str.length(); i++) {
			ts.add(str.charAt(i));
		}
		System.out.println(ts);

		Iterator<Character> iterator = ts.iterator();
		while(iterator.hasNext()){
			Character c = iterator.next();
			res = res+c+"";
		}
		
		System.out.println(res);
		return str;

	}
}