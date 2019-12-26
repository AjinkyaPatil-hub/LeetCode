package com.LeetCode.Sorting;

import java.util.Comparator;
import java.util.TreeMap;

public class SortUsingTreeMap {

	public static void main(String[] args) {
		Emp emp = new Emp(1, "ajay", "M");
		Emp emp2 = new Emp(1, "mukund", "M");
		Emp emp3 = new Emp(3, "akshay", "M");
		
		TreeMap<Emp,Integer> ts = new TreeMap<>(new EmpCompare().byIdAndName);
		ts.put(emp,1);
		ts.put(emp2,2);
		ts.put(emp3,3);
		System.out.println(ts);
	}
	
}

class EmpCompare implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {

		return o1.getId()-o2.getId();
	}
	
	static Comparator<Emp> byName = new Comparator<Emp>() {
		
		@Override
		public int compare(Emp o1, Emp o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
	};
	

	static Comparator<Emp> byIdAndName = new Comparator<Emp>() {
		
		@Override
		public int compare(Emp o1, Emp o2) {
			int temp = o1.getId()-o2.getId();
			if(temp == 0){
			temp=	o1.getName().compareTo(o2.getName());
			}
			return temp;
		}
	};
	
}

class Emp {
	private int id;
	private String name;
	private String gender;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "\n [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
