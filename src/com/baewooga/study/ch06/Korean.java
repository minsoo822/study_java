package com.baewooga.study.ch06;

public class Korean {

	String name;
	String ssn;
//	String nationality;
	int age;
	
	Korean() {
		
	}
	
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
			
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}		
	
	public void show() {
		System.out.println("이름: "+name+", 주번: "+ssn+", 나이: "+age);
	}
	
	
	/*****************************/
	static String nationality = "대한민국";
	/****************************/
	
	
	static int staticTest (int a) {
		return a + 10;
	}
	
	
	
	public void test2 () {
		
//		Arithmetic arithmetic = new Arithmetic();
//		arithmetic.staticTest();
		
		Arithmetic.staticTest();
	}
	
	
}
