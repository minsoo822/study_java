package com.baewooga.study.ch07.sixth;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();	//추상메소드는 내용은 없다
	public abstract void sound(String m);
	
}
