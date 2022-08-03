package com.baewooga.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		
//		int 변수에 v1 에 초기값 5
//		int 변수에 v2 에 초기값 2
		
		int v1 = 5;
		int v2 = 2;
		
		
//		int 변수 result1 에 + 연산후 출력
		int result1 = v1 + v2;
		System.out.println("result1: " + result1);
		
//		int 변수 result2 에 - 연산후 출력
		int result2 = v1 - v2;
		System.out.println("result2: " + result2);	
		
//		int 변수 result3 에 * 연산후 출력
		int result3 = v1 * v2;
		System.out.println("result3: " + result3);
		
//		int 변수 result4 에 / 연산후 출력
		int result4 = v1 / v2;
		System.out.println("result4: " + result4);
		
//		int 변수 result5 에 % 연산후 출력
		int result5 = v1 % v2;
		System.out.println("result5: " + result5);
		
		
//		************************************************중요
		double result6 = v1 / v2;
		System.out.println("result6: " + result6);
	
		double result7 = (double) v1 / v2;
		System.out.println("result7: " + result7);
//*********************************************************
		
		double asd1 = 1.66667;		
		double asd2 = 0.625;		
		double asd3 = 9.8;		
		double asd4 = (asd1-asd2)*asd3;
		
		System.out.println(asd4);
		
		double qwe1 = 5;		
		double qwe2 = 3.25;		
		double qwe3 = 1.83333;		
		double qwe4 = 0.70588;		
		double qwe5 = qwe1-(qwe2-qwe3)*qwe4;
		
		System.out.println(qwe5);
		

		
		
		int a1 = 8;
		int a2 = 7;
		int a3 = 5;
		int a4 = a1+a2+a3;
		System.out.println(a4);
		
		int b1 = 1;
		int b2 = 9;
		int b3 = 5;
		int b4 = b1+b2+b3;
		System.out.println(b4);
		
		int c1 = 5;
		int c2 = 6;
		int c3 = 6;
		int c4 = c1+c2+c3;
		System.out.println(c4);
		
		int d1 = 4;
		int d2 = 7;
		int d3 = 1;
		int d4 = d1+d2+d3;
		System.out.println(d4);
		
		int e1 = 7;
		int e2 = 5;
		int e3 = 5;
		int e4 = e1+e2+e3;
		System.out.println(e4);
		
		
		/*
		 * sum(8,7,5); sum(1,9,5); sum(5,6,6); sum(4,7,1); sum(7,5,5);
		 */		
		/*
		 * aaa(60,70,85,90,45); bbb(50,75,70,60,70); ccc(55,60,64,58,90);
		 * ddd(80,70,63,88,78);
		 */
		
		/*
		 * average(60,70,85,90,45); average(50,75,70,60,70); average(55,60,64,58,90);
		 * average(80,70,63,88,78);
		 */
		
	}
	

	/*
	 * public static void sum(int a, int b, int c) {
	 * 
	 * System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
	 * 
	 * }
	 * 
	 * public static void aaa(int a5, int a6, int a7, int a8, int a9) {
	 * System.out.println("홍길동 평균: " + a5 + " + " +a6+ " + " +a7+ " + " +a8+ " + " +
	 * a9 + " = " + (a5+a6+a7+a8+a9)/5); }
	 * 
	 * public static void bbb(int b5, int b6, int b7, int b8, int b9) {
	 * System.out.println("박말순 평균: " + b5 + " + " +b6+ " + " +b7+ " + " +b8+ " + " +
	 * b9 + " = " + (b5+b6+b7+b8+b9)/5); }
	 * 
	 * public static void ccc(int c5, int c6, int c7, int c8, int c9) {
	 * System.out.println("고장난 평균: " + c5 + " + " +c6+ " + " +c7+ " + " +c8+ " + " +
	 * c9 + " = " + (c5+c6+c7+c8+c9)/5); } public static void ddd(int e5, int e6,
	 * int e7, int e8, int e9) { System.out.println("도룡뇽 평균: " + e5 + " + " +e6+
	 * " + " +e7+ " + " +e8+ " + " + e9 + " = " + (e5+e6+e7+e8+e9)/5); }
	 */
}
