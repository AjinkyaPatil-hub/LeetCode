package com.LeetCode.convertStringToDate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class A{
	
	int a=7;

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
	
}
class B {
	int c=9;

	@Override
	public String toString() {
		return "B [c=" + c + "]" + super.toString();

	}

	B(int a) {
		
	}

	public B() {
		this(8);
		
	}

}

public class Solution {

	public static void main(String[] args) throws ParseException {

		B a = new B();
		System.out.println(a);

		String str = "20190224";
		// convert this data into date format;
		DateFormat formater = new SimpleDateFormat("YYYYDDMM");
		Date date = formater.parse(str);
		System.out.println(date);
		System.out.println(date.getDate());
	}
}
