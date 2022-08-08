package com.baewooga.study.ch04;

public class IfExample {

	public static void main(String[] args) {

		int score = 80;
		
		if (score >= 90) {
			System.out.println("A");
		} else {
			System.out.println("A는 아니구나");
		}
		
		int score2 = 60;
	
		if (score2 >= 90) {
			System.out.println("A학점");
		} else if (score2 >= 80) {
			System.out.println("B학점");
		} else if (score2 >= 70) {
			System.out.println("C학점");
		} else if (score2 >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		
		
		int score3 = 85;
		
		if (score3 >= 90) {
			if(score >= 97) {
				System.out.println("A+");
			}
			else if(score >= 92) {
				System.out.println("A-");
			}
			else {
				System.out.println("A");
			}
		} 
		else if(score3 >= 80 & score < 90) {
			if(score >= 87) {
				System.out.println("B+");
			}
			else if(score3 <= 82) {
				System.out.println("B-");
			}
			else {
				System.out.println("B");
			}
		}
		else if(score3 >= 70 & score < 80) {
			if(score >= 77) {
				System.out.println("C+");
			}
			else if(score3 <= 72) {
				System.out.println("C-");
			}
			else {
				System.out.println("C");
			}
		}
		else if(score3 >= 60 & score < 70) {
			if(score >= 67) {
				System.out.println("D+");
			}
			else if(score3 <= 62) {
				System.out.println("D-");
			}
			else {
				System.out.println("D");
			}
		}
		else {
			System.out.println("F");
		}
		

		
	}

}
