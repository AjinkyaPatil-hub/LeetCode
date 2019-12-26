package com.LeetCode.findingAllDupInArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 1, 8, 8, 8,0,0,0,0,0 };
		printingAllDuplicates(arr);
	}

	private static void printingAllDuplicates(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (!al.contains(arr[i])) {
				al.add(arr[i]);
			
			} else {
				set.add(arr[i]);
			}
		}
		System.out.println(al);
		System.out.println("Duplicated Elements Are: "+set);
	}
}
