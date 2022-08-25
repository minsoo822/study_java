package com.baewooga.study.ch07.first;

public class DmbCellPhone extends CellPhone {

	//필드
	int channel;
	
	//명시자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	DmbCellPhone() {
	
	}
	
	//메소드
	
	void turnOnDmb() {
		System.out.println("채널 " +channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb() {
		System.out.println("채널 " +channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
	
}
