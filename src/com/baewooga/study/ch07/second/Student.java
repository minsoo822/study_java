package com.baewooga.study.ch07.second;

public class Student extends Peple {
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
		super();
	}
	
	
}
