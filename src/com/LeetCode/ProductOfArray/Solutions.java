package com.LeetCode.ProductOfArray;

import java.util.Arrays;


public class Solutions {

	public static void main(String[] args) {
		int[] arr={1,2,3,4};
		productOfArryDiv(arr);
		int[] res = productOfArrWithoutDiv(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] productOfArrWithoutDiv(int[] arr) {
		int[] left = new int[arr.length];
		int[] right = new int[arr.length];
		int[] res = new int[arr.length];
		
		left[0]=1;
		right[right.length-1]=1;	
		for(int i=1;i<left.length;i++){
			left[i] = arr[i-1]*left[i-1];
		}
		for(int i=right.length-2;i>=0;i--){
			right[i] = arr[i+1]*right[i+1];
		}
		System.out.println("left :"+Arrays.toString(left));
		System.out.println("right: "+Arrays.toString(right));
		for(int i=0;i<arr.length;i++){
			res[i] = left[i]*right[i];
		}
		return res;
	}

	private static int[] productOfArryDiv(int[] arr) {
		int result = 1;
		for(int i=1;i<arr.length;i++){
			result=result*arr[i];
		}
		int res[] =new int[arr.length];
		for(int i=0;i<arr.length;i++){
			res[i] = result/arr[i];
		}
		return res;
		
	}
}
