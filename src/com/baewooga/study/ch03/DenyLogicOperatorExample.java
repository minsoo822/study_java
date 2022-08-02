package com.baewooga.study.ch03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		
		boolean play = true;
		System.out.println("play: " + play);	//true
		
		
//		 논리부정연산자 :  ! 
		
		play = !play;
		System.out.println("play: " + play);	//false
		play = !play;
		System.out.println("play: " + play);	//true
		
		int j =3;
		
		if (!(j==3)) {
				System.out.println("3이 아님");
		}	else {
				System.out.println("3임");
		}
		
		
		
		
		
	}

}
