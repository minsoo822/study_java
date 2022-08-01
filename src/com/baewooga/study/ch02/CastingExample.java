package com.baewooga.study.ch02;

public class CastingExample {

	public static void main(String[] args) {
		
		// 강제 형변환 : casting : (원하는 형) 변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleValue: " + doubleValue);
		
		double doubleValue2 = 1234567891;
		System.out.println("doubleValue2: " + doubleValue2);
		
		//float 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatValue: " + floatValue + " 입니다.");
		
		
		//long 변수에 float 대입
		long longValue = (long) floatValue;
		System.out.println("longValue: " + longValue + " 입니다.");
		
		
		//int 변수에 long 대입
		int intValue = (int) longValue;
		System.out.println("intValue: " + intValue + " 입니다.");
		
		//short 변수에 int 대입
		short shortValue = (short) intValue;
		System.out.println("shortValue: " + shortValue + " 입니다.");
		
		
		//byte 변수에 short 대입
		byte byteValue = (byte) shortValue;
		System.out.println("byteValue: " + byteValue + " 입니다.");
		
		
//-----------------------------------------------------------		
		
		//string을 int로 변환
		String stringValue = String.valueOf(intValue);
		System.out.println("stringValue: "+stringValue+" 입니다.");
		
		//int를 string으로 변환
		int intValue2 = Integer.parseInt(stringValue);
		System.out.println("intValue2: " + intValue2 + " 입니다.");
		
		
		
		
		//string을 int로 변환
//		String StringValue1 = "123";
//		
//		int intValue2 = Integer.parseInt(StringValue1);
//		System.out.println("intValue2: " + intValue2 + " 입니다.");
//				
//
//		
		//int를 string으로 변환
//		int intValue1 = 123;
//		
//		String StringValue = Integer.toString(intValue1);
//		System.out.println("StringValue: " +StringValue+" 입니다.");
		
		
	}

}
