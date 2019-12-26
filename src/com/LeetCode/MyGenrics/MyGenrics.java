package com.LeetCode.MyGenrics;

import java.beans.Expression;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class MyGenrics {

	public static void main(String[] args) {
	Student<String,Integer> stud=new Student("AA", 54);
	Student<Integer,Boolean> s = new Student(88, true);
		System.out.println(stud);
		System.out.println(s);
	
		ExpressionParser parser = new SpelExpressionParser();  
		org.springframework.expression.Expression exp = parser.parseExpression("'Welcome SPEL'.concat('!')");  
		String message = (String) exp.getValue();  
		System.out.println(message);  
	}
}

class Student<T1,T2>{
	
	T1 num;
	T2 num2;
	public Student(T1 num, T2 num2) {
		super();
		this.num = num;
		this.num2 = num2;
	}
	public T1 getNum() {
		return num;
	}
	public void setNum(T1 num) {
		this.num = num;
	}
	public T2 getNum2() {
		return num2;
	}
	public void setNum2(T2 num2) {
		this.num2 = num2;
	}
	@Override
	public String toString() {
		return "Student [num=" + num + ", num2=" + num2 + "]";
	}
	
}