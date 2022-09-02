package com.baewooga.study.test01;

public class ComputerExamlple {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		int radius = 7;
		
		System.out.println("원의 반지름: " + radius);
		System.out.println();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " +calculator.circle(radius));
		System.out.println();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("원면적: " + computer.circle(radius));
		
		
		

	}

}
