package com.LeetCode.palindromLL;

public class Solution {
	public static void main(String[] args) {
		
		int[] arr={1,2,2,1,2};
		
		int i =0;
		int j =arr.length-1;
		boolean flag =false;
		while(i<=j){
			if(arr[i] == arr[j])
			{
				i++;
				j--;
				flag = true;
			}else{
				break;
			}
		}
		if(flag){
			System.out.println("Palindrom");
		}else
			System.out.println("not a aplindrom");
	}
}
