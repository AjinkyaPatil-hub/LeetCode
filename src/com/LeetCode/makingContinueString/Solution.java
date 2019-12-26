package com.LeetCode.makingContinueString;

public class Solution {
	public static void main(String[] args) {
		String str = "AABAABB";
		int k = 1;
		System.out.println(longestString(str, k));
	}

	private static int longestString(String str, int k) {
		int i=0;
		int length=1;
		int max=0;
		while(i<str.length()){
			int check =0;
			int j=i+1;
			while(j<str.length()){
				if(str.charAt(i)==str.charAt(j)){
					j++;
					length++;
				}else{
					if(check != k){
						j++;
						length++;
						check++;
					}else{
						i++;
						break;
					}
				}
			}
			if(max < length){
				max = length;
			}else{
				i++;
			}
			length=1;
		}
		return max;
		
	}
}
