package com.baewooga.study.ch04;

public class WhilePrintFrom1To10Example {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			System.out.println(i + " : " + sum);
			i++;
			
		}

	}

}
