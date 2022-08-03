package com.baewooga.study.ch03;

public class CompareOperatorExample {

	public static void main(String[] args) {
		
		
		//비교연산자  if문에사용 / 무조건 true 나 false 로만 나타난다
		
		int num = 10;
		int num2 = 20;
		
		// ==
		boolean result1 = (num == num2);	//false
		System.out.println(result1);
		
		// !=
		boolean result2 = (num != num2);	//true
		System.out.println(result2);
		
		// <
		boolean result3 = (num < num2);		//true
		System.out.println(result3);
		
		// <=
		boolean result4 = (num <= num2);	//true
		System.out.println(result4);
		
		// >
		boolean result5 = (num > num2);		//false
		System.out.println(result5);
		
		// >=
		boolean result6 = (num >= num2);	//false
		System.out.println(result6);
		
		
	}

}
