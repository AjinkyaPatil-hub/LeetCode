package com.LeetCode.CharCount;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public class CountNoOfWords {

	private static List<String> asList;

	public static void main(String[] args) {

		HashMap<String , Integer> hm = new HashMap<String, Integer>();
		System.exit(0);

		String str = "We are Alive !";
		//o/p ---! Alive are We.	
		System.out.println("orginal string: "+ str);
		System.out.println("reversing the sting: "+countNoOfWords(str));
	}

	private static String countNoOfWords(String str) {
		//split string by " ";
		String[] split = str.split(" ");
		
		//convert split to list 
		List<String> list = Arrays.asList(split);
		//reversing the list
		Collections.reverse(list);
		
	
		//List convert into arr
		String[] arr = (String[]) list.toArray();
		
		//fetch one by one and string and place into string
		String finalRes="";
		for(int i=0;i<arr.length;i++){
			finalRes = finalRes+arr[i]+" ";
		}
	return finalRes;
	}
}