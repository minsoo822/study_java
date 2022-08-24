package com.baewooga.study.ch06;

public class MinsooExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Minsoo k1 = new Minsoo("김민수" ,"010-4500-0161");
		
		System.out.println("k1.name: " + k1.name);
		System.out.println("k1.phone: " + k1.phone);
		
		
		Minsoo k2 = new Minsoo("김민수", 30, "남자");
		System.out.println("k2.name: " + k2.name);
		System.out.println("k2.age: " + k2.age);
		System.out.println("k2.gender: " + k2.gender);
		
		Minsoo k3 = new Minsoo("김민수", 30, "남자", "010-4500-0161");
		System.out.println("k3.name: " + k3.name);
		System.out.println("k3.age: " + k3.age);
		System.out.println("k3.gender: " + k3.gender);
		System.out.println("k3.phone: " + k3.phone);
	}

}
