//https://www.youtube.com/watch?v=PN68qx-Qkdw&list=PLU_sdQYzUj2keVENTP0a5rdykRSgg9Wp-&index=29
package com.LeetCode.sqrOfSortedArray;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] arr={-1,0,-8,5,7};
		System.out.println("before"+Arrays.toString(arr));
		sqrAndSort(arr);
		System.out.println("after"+Arrays.toString(arr));
	
	}

	private static int[] sqrAndSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i]*arr[i];
		}
		Arrays.sort(arr);
		return arr;
		
	}
}
