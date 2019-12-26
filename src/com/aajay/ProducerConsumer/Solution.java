package com.aajay.ProducerConsumer;

class Tree{
	
}
class Oak extends Tree{
	
}

public class Solution {

	public static void main(String[] args) {
		
		String str="12abac54";
		int res = 0;
		char c;
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				c =str.charAt(i);
				res =res+(int)c;
			}
		}
		System.out.println(res);
	}
}
