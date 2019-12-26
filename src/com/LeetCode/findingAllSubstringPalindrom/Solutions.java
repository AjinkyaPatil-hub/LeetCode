package com.LeetCode.findingAllSubstringPalindrom;

public class Solutions {
	public static void main(String[] args) {
		String str="aabb";
		findingAllPaindroms(str);
	}

	private static void findingAllPaindroms(String str) {
		int i=0;
		String larger="";
		while(i<str.length()){
			int j=i+1;
			while(j<str.length()){
				String sub = str.substring(i, j+1);
				StringBuffer sb = new StringBuffer(sub);
				sb.reverse();
				if(sub.contentEquals(sb)){
					if(sub.length()>larger.length()){
						larger = sub;
					}
					System.out.println(sb);
				}
				j++;
			}
			i++;
		}
		System.out.println("Larger:" +larger);
		
	}
}
