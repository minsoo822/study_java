package com.baewooga.study.ch07.third;

public class Computer extends Calculator {

	
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areacircle 실행");
		return Math.PI * r * r;
	}

}
