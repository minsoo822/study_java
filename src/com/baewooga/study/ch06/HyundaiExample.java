package com.baewooga.study.ch06;

import java.util.Arrays;

public class HyundaiExample {

	public static void main(String[] args) {


		Hyundai hyundai = new Hyundai();
		
		System.out.println("hyundai.name[2]: " + hyundai.name[2]);
		
		
		for (int i = 0; i < hyundai.name.length; i++) {
			System.out.print(" ");
			System.out.print(hyundai.name[i]);
		}	
		
	}

}
