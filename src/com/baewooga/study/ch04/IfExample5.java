package com.baewooga.study.ch04;

public class IfExample5 {
	public static void main(String[] args) {
//		int 타입의 변수를 2개 선언하고
//		두 정수 가 주어졌을때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오
		
		int y = 6;
		int x = 5;
		
		
		if(x > 0 && y >0) {
			System.out.println("1사분면");
		} else if(x < 0 && y > 0) {
			System.out.println("2사분면");
		} else if(x < 0 && y < 0) {
			System.out.println("3사분면");
		} else { // x > 0 && y < 0
			System.out.println("4사분면");
		}

		
		
		
		
		
	}
	
}
