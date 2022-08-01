package com.baewooga.study.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
		
//		작은것 -> 큰것 = 자동변환 (promotion)
//		큰것 -> 작은것 = 강제변환 (casting)***
//		String->int 로 바꾸는것을 많이한다
//		작은형이 큰 형으로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실이 발생한다.
//		byte < short < int < long < float < double

		byte byteValue = 10;
		System.out.println("byteValue: " + byteValue +" 입니다.");
		
		short shortValue = byteValue;	//10
		System.out.println("shortValue: " + shortValue +" 입니다.");
	
		//int 에 short 대입 후 출력
		
		int intValue = shortValue;
		System.out.println("intValue: " +intValue+ " 입니다.");
		
		
		//long 에 int 대입 후 출력
		long longValue = intValue;
		System.out.println("longValue: " + longValue +" 입니다.");
		
		//float 에 long 대입 후 출력
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue +" 입니다.");
		
		//double 에 float 대입 후 출력
		double doublwValue = floatValue;
		System.out.println("doublwValue: " + doublwValue +" 입니다.");
		

		

	
	}

}
