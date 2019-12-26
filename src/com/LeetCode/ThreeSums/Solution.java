package com.LeetCode.ThreeSums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		int arr[] = {-1,0,1,2,-1,-4};
		List<int[]> threeSums = threeSums(arr);
		for (int[] is : threeSums) {
			System.out.println(Arrays.toString(is));
		}
	}

	private static List<int[]> threeSums(int[] arr) {
		//sort an array
		Arrays.sort(arr);
		
		ArrayList<int[]> result = new ArrayList<>();
		for(int i=0;i<arr.length-3;i++){
			//checking i==0 for first time and arr[i]>arr[i-1] for next elements
			if(i ==0 || arr[i] > arr[i-1]){
				int start = i+1;
				int end = arr.length-1;
				
				while(start<end){
					if(arr[i]+arr[start]+arr[end] == 0){
						result.add(new int[] {arr[i],arr[start] , arr[end]});
					}
					//start++;
					if(arr[i]+arr[start]+arr[end] <0)
					{
						int currentStart = start;
						while(arr[start] == arr[currentStart] && start<end){
							//duplicate element found
							start++;
						}
					}
					//end--
					else{
						int currentEnd =end;
						while(arr[end] == arr[currentEnd]&& start<end){
							end--;
						}
					}
				}
			}
		}
		return result;
	}
}
