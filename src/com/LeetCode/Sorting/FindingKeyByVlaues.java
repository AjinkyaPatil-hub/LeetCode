package com.LeetCode.Sorting;

import java.util.HashMap;
import java.util.Map;

class Employee{
	private String name;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}

public class FindingKeyByVlaues {

	public static void main(String[] args) {
	
		HashMap<String, Employee> hm2 = new HashMap<String, Employee>();
		hm2.put("1", new Employee("ajay"));
		hm2.put("2", new Employee("mukund"));
		
		String key2="";
		Employee value2 = new Employee("ajay");
		
		for(Map.Entry entry : hm2.entrySet()){
			if(value2.equals(entry.getValue())){
					System.out.println(entry.getKey());
				}
		}
		
		System.exit(0);
		
		HashMap<String , String> hm = new HashMap<String, String>();
		hm.put("tall", "patil");
		hm.put("ajay", "patil");
		hm.put("mukund", "waghmode");
		
		String key="";
		String value="patil";
		
		for(Map.Entry entry:hm.entrySet()){
			if(value.equals(entry.getValue())){
				System.out.println(entry.getKey());
			}
		}
	}
}
