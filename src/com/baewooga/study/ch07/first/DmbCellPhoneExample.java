package com.baewooga.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
	//	부모클래스 만들어서 부모함수 호출
			
	CellPhone cellPhone = new CellPhone();
	
	cellPhone.powerOn();
	cellPhone.powerOff();
	cellPhone.bell();
	cellPhone.sendVoice("안녕 잘지내니?");
	cellPhone.receiveVoice("응 너는 어떻게 지내?");
	cellPhone.hangUp();
		
		
	//	자식클래스 만들어서 자식 함수 호출
	DmbCellPhone cellPhone2 = new DmbCellPhone("갤럭시 노트10", "White", 11);
	
	cellPhone2.turnOnDmb();
	cellPhone2.changeChannelDmb();
	cellPhone2.turnOffDmb();
	
	
	//	자식클래스 만들어서 부모, 자식 함수 호출
		
	DmbCellPhone cellPhone3 = new DmbCellPhone("베가아이언", "실버", 7);
	
	cellPhone3.powerOn();
	cellPhone3.powerOff();
	cellPhone3.bell();
	cellPhone3.sendVoice("하이~");
	cellPhone3.receiveVoice("하2루~");
	cellPhone3.hangUp();
	
	cellPhone3.turnOnDmb();
	cellPhone3.changeChannelDmb();
	cellPhone3.turnOffDmb();
	
	
	
	
	
	}

}
