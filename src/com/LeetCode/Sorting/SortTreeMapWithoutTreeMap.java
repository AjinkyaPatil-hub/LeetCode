package com.LeetCode.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class SortTreeMapWithoutTreeMap {

	public static LinkedHashMap<Integer, String> sortHashMapByKey(Map<Integer, String> unsorted){
		//move all keys to list
		List<Integer> list = new ArrayList<>(unsorted.keySet());
		//sort the keys
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}	
		});
		//put keys and value in linkedHashMap 
		LinkedHashMap<Integer, String> res = new LinkedHashMap<>();
		//traversing the list and putting each key and its value in the linkedHashMap
		for(Integer keys:list){
			res.put(keys, unsorted.get(keys));
		}
		return res;
	}
	
	public static LinkedHashMap<Emp, Integer> sortByList(Map<Emp,Integer> unMap){
		//get all keys  into list
		List<Emp> list = new ArrayList<>(unMap.keySet());
		//sort all keys
		Collections.sort(list, new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
			//put keys and its value into linkedHashMap
		LinkedHashMap<Emp, Integer> lHap = new LinkedHashMap<>();
		for(Emp keys:list){
			lHap.put(keys, unMap.get(keys));
		}
		return lHap;
	}
	
	
	public static void main(String[] args) {
	
		Emp emp = new Emp(1, "ajay", "M");
		Emp emp2 = new Emp(1, "ajay", "M");
		Emp emp3 = new Emp(1, "akshay", "M");


		TreeMap<Integer, String> tm = new TreeMap<>();
		tm.put(1, "ajay");
		tm.put(1, "mukund");
		tm.put(9, "akshay");
		
		System.out.println(sortHashMapByKey(tm));
		
			
		Map<Emp, Integer> tm2 = new HashMap<Emp, Integer>();

		tm2.put(emp,1);
		tm2.put(emp2,2);
		tm2.put(emp3,3);
		System.out.println(sortByList(tm2));
	}
}
