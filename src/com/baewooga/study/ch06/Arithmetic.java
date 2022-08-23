package com.baewooga.study.ch06;

public class Arithmetic {

//	
//	int add = 0;
//	int minus = 0;
//	int Multi = 0;
//	String say = "값은 ";
//	
//	
//	public int add(int a, int b) {
//		int result = add;
//		add = a + b;
//		return add;
//	}

	public int add (int a, int b) {
		
		return a + b;
	}
	public int minus (int a, int b) {
			
			return a - b;
		}
	public int multi (int a, int b) {
		
		return a * b;
	}
	public int divid (int a, int b) {
		
		return a / b;
	}
	public int remind (int a, int b) {
		
		return a % b;
	}
	
	public void say(int result) {
		System.out.println("값은 " + result + "입니다.");
	}
	

	
}
