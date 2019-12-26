package com.LeetCode.CharCount;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CharCountOfString {

	public static void main(String[] args) {
		String str = "I am java developer";
		charChountOfSt(str);
	}

	private static void charChountOfSt(String str) {
		LinkedHashMap<Character, Integer> countChar = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (countChar.containsKey(c)) {
				if (c == ' ') {

				} else
					countChar.put(c, countChar.get(c) + 1);
			} else {

				countChar.put(c, 1);
			}
		}
		System.out.println(countChar);
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (countChar.get(c) == 3) {
				System.out.println(c);
				break;
			}
		}
	}
}
