package com.baewooga.study.ch07.second;

public class Peple {
	
	public String name;
	public String ssn;
	
	
	//부모에 생성자가 존재한다
	public Peple(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	//명시적 생성자
	public Peple() {
		
	}
}
