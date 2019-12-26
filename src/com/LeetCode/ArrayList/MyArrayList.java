package com.LeetCode.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {

	int[] arr;
	int capacity=3;
	static int size=0;
	//passing def const.
	public MyArrayList() {
		arr = new int[capacity];
		
	}
	//passing particular size
	public MyArrayList(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		
	}
	
	
	@Override
	public String toString() {
		return "MyArrayList [arr=" + Arrays.toString(arr) + "]";
	}
	
	public boolean add(int data){
			//true for list is full
		boolean checkList = checkList(size);
		if(checkList){
			
			int newList = 3*capacity;
			int[] arrNew = new int[newList];
			arrNew = Arrays.copyOf(arr, newList);
			
			arrNew[size++] = data;
			System.out.println("new:"+Arrays.toString(arrNew));
			return true;
			
		}else{
			arr[size++] = data;
			return true;
		}
		
	
	}asd
	private boolean checkList(int size) {
		if(arr.length == size){
			return true;
		}
		return false;
		
		
	}
}
