package com.LeetCode.FindingMiddleIndex;

public class FindMiddleIndex {

	public static void main(String[] args) {
		int []arr={2,4,3,1,4,5,1};
		System.out.println(findMidddleIndex(arr));
	}

	private static boolean findMidddleIndex(int[] arr) {
		int start=0;
		int last = arr.length-1;
		int sumLeft=0;
		int sumRight=0;
		while(true){
			if(sumLeft > sumRight) {
				//add last element into sum of lastsum
				sumRight +=arr[last--];
			}else{
				sumLeft += arr[start++];
			}
			if(start > last){
				if(sumLeft==sumRight){
					return true;
				}else{
					return false;
				}
			}
		}
		
	}

	
}
