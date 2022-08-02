package com.baewooga.study.ch02;

public class OperationPromotionExample {

	public static void main(String[] args) {
		
//		byte 변수 byteValue 선언하고 12로 초기화
		byte byteValue = 12;
		
		
//		byte 변수 byteValue2 선언하고 12로 초기화
		byte byteValue2 = 12;
		

//		byte 변수 byteValue3 선언하고 위의 두변수를 합 연산 수행
		
//		byte byteValue3 = byteValue + byteValue2;	//에러
		int byteValue3 = byteValue + byteValue2;
		
//		byteValue3 결과 출력
		
		System.out.println(byteValue3);

//-----------------------------------------------------------
		

		short shortVlaue = 12;
		short shortVlaue2 = 12;
		int shortVlaue3 = shortVlaue + shortVlaue2;
		System.out.println(shortVlaue3);
		
		int intValue = 12;
		int intValue2 = 12;
		int intValue3 = intValue + intValue2;
		System.out.println(intValue3);
		
		long longValue =12;
		long longValue2 =12;
		long longValue3 = longValue + longValue2;
		System.out.println(longValue3);
		
		float floatValue = 12;
		float floatValue2 = 12;
		float floatValue3 = floatValue + floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue = 12;
		double doubleValue2 = 12;
		double doubleValue3 = doubleValue + doubleValue2;
		System.out.println(doubleValue3);
		
		
//		byte byteValue4 = byteValue + intVlaue;		//에러. 작은것값과 큰괏이 더해지면 큰값을 따라간다		
		int intValue4 = byteValue + intValue;
		
		System.out.println(intValue4);
		
		
//		int intValue5 = intValue + doubleValue;		//에러. 작은것값과 큰괏이 더해지면 큰값을 따라간다
		double doubleValue4 = intValue + doubleValue;
		System.out.println(doubleValue4);
		
	}

}
