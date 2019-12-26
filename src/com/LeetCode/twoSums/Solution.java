package com.LeetCode.twoSums;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		int[] res= twoSums(arr,5);
		System.out.println("index: "+Arrays.toString(res));
	}

	private static int[] twoSums(int[] arr , int sum) {
		
		int a_pointer=0;
		int b_pointer =arr.length-1;
		
		while(a_pointer < b_pointer){
			int res = arr[a_pointer]+arr[b_pointer];
			if(res > sum){
				b_pointer--;
			}else if(res < sum){
				a_pointer++;
			}else{
				return new int[] {a_pointer,b_pointer};
			}
		}
		
		return null;
	}	
}
