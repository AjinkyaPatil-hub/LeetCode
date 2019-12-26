//Slinding Window Problem
package com.LeetCode.longestSubSeq;

public class Solution {

	public static void main(String[] args) {
		int[] arr={1,3,5,4,7,8,9,10};
		longestSubSeq(arr);
	}

	private static void longestSubSeq(int[] arr) {
		int anchor=0;
		int i=0;
		int result=0;
		for(i=0;i<arr.length;i++){
			if(i>0 && arr[i-1]>=arr[i])
				anchor = i;
			result = Math.max(result, i-anchor+1);	
		}
		System.out.println(result);
		
	}
}
