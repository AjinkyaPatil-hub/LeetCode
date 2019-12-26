package com.LeetCode.PalindromIntger;

public class Solution {
public static void main(String[] args) {
	int num = -121;
	int temp = num;
	String str = "";
	if(num < 0)
		System.out.println("Not Plindrom");
	else{
	while(temp != 0){
		if(temp < 0)
			break;
		int rem = temp%10;
		str = str+rem;
		temp = temp/10;
	}
	}
	int com = Integer.parseInt(str);
	if(num == com)
		System.out.println("palindrom");
		else
		System.out.println("Not palindrom");
}
}
