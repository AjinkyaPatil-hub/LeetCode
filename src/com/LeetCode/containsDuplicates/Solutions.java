package com.LeetCode.containsDuplicates;

import java.util.ArrayList;
import java.util.List;

public class Solutions {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5 };
		boolean res = containsDup(arr);
		System.out.println(res);
	}

	private static boolean containsDup(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			} else {
				return true;
			}
		}

		return false;
	}

}
