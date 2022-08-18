package com.baewooga.study.ch05;

import java.util.Iterator;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		Week abc;
		
		Week xyz;
		
		
//		abc = 1;
//		abc = "dsdsds";
//		abc = 1.1;
		abc = Week.MONDAY;
		
		System.out.println("Week.FRIDAY: " + Week.FRIDAY);
		System.out.println("abc: " + abc);
		
//		String name = abc;
		String name = abc.name();
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal: " + ordinal);
		
		xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
		Week[] days = Week.values();
		
		int inrdex = 0;
		for(Week day: days) {
			System.out.println(inrdex + ": day: " + day);
			inrdex++;
		}
		
		
		
		
		
		
	}

}
