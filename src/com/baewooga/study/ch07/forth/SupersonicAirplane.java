package com.baewooga.study.ch07.forth;

public class SupersonicAirplane extends Airplane {

	
//	상수를 사용할때는 대문자를 사용
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
	
	
}
