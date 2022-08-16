package com.baewooga.study.ch04;

public class DoWhileExample {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			System.out.println(i + " : " + sum);
			i++;
		} while (i <= 10);

	}

}
