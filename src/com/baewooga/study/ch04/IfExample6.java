package com.baewooga.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		
//		int 타입의 변수를 3개 선언하고
//		세 정수중에서 최대값 최소값을 구하는 프로그램을 작성하시오
		
//		int a = 3;
//		int b = 6;
//		int c = 2;
//		
//		if(a>b) {
//			System.out.println("a가 크다");
//		} else if(a>b) {
//			System.out.println("b가 크다");
//		} else if(c>a) {
//			System.out.println("c가크다");
//		} else if(c>b) {
//			System.out.println("a가크다");
//		} else {
//			System.out.println("모르겠다");
//		}
		
	
		int a = 2;
		int b = 6;
		int c = 3;
		
		if(a != b && b != c && c != a) {
			if(a > b && a > c) {
				System.out.println("최대값은 a: " + a);
			} else if (b > a && b > c) {
				System.out.println("최대값은 b: " + b);
			} else {
				System.out.println("최대값은 c: " + c);
			}
			
			
			if(a < b && a < c) {
				System.out.println("최소값은 a: " + a);
			} else if(b < a && b < c) {
				System.out.println("최소값은 b: " + b);
			} else {
				System.out.println("최소값은 c: " + c);
			}
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요.");
		}
		
		
		
		
		
	}

}
