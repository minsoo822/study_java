package com.baewooga.study.ch06;

public class Post {

	boolean use;
	String name;
	int lookup;
	
	
	Post() {
	
	}
	Post(String name) {
		this.name = name;
	}
	Post(String name, int lookup) {
		this.name = name;
		this.lookup = lookup;
	}
	Post(String name, boolean use) {
		this.name = name;
		this.use = use;
	}
	Post(String name, int lookup, boolean use) {
		this.name = name;
		this.lookup = lookup;
		this.use = use;
	}
	
	
	public void show() {
		System.out.println("이름: "+name+", 조회수: "+lookup+", 사용여부: "+use);
	}
	
	
	
	
	
//	public void show() {
//		System.out.println(this.name);
//		System.out.println(this.lookup);
//		System.out.println(this.use);
//	}
}
