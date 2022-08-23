package com.baewooga.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		
		Arithmetic arithmetic = new Arithmetic();
		
//		
//		
//		int resultAdd = arithmetic.add(5, 0);
//		
//		
		
	
		
		
		int resultAdd = arithmetic.add(4, 4);
		int resultMinus = arithmetic.minus(4, 4);
		int resultMulti = arithmetic.multi(4, 4);
		int resultDivid = arithmetic.divid(4, 4);		
		int resultremind = arithmetic.remind(4, 4);		
	
		
		arithmetic.say(resultAdd);
		arithmetic.say(resultMinus);
		arithmetic.say(resultMulti);
		arithmetic.say(resultDivid);
		arithmetic.say(resultremind);
		
		

	}

}
