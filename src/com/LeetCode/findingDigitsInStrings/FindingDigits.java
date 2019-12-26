package com.LeetCode.findingDigitsInStrings;

import java.util.LinkedList;


public class FindingDigits implements Cloneable {

	public static void main(String[] args) {
		String str = "222a54bc8";
		// findingDigitsInString(str);
		// addingDigitsInString(str);
		//addingOnlySeqOfDigits(str);
		LinkedList<Integer> ll = new  LinkedList<>();

	}

	private static void addingOnlySeqOfDigits(String str) {
		
		
		StringBuffer sf = new StringBuffer();
		String temp = "";
		int tototl = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				temp = str.charAt(i) + "";
				tototl = tototl + Integer.parseInt(temp);
			} else {
				if (tototl != 0)
					System.out.println(tototl);


				tototl = 0;
			}

		}
		System.out.println(tototl);
		System.out.println(sf);

	}

	private static void addingDigitsInString(String str) {
		String temp = "";
		int res = 0;

		for (int i = 0; i < str.length(); i++) {
			// finding digits
			if (Character.isDigit(str.charAt(i))) {
				temp = temp + str.charAt(i) + "";
			} else {
				// if it is not char theen add that number into res
				res = res + Integer.parseInt(temp);
				// and again make string empty
				temp = "0";
			}
		}
		res = res + Integer.parseInt(temp);
		System.out.println(res);
	}

	private static void findingDigitsInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				System.out.print(str.charAt(i) + "");
			}
		}

	}
}
